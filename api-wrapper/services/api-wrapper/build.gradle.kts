plugins {
    `java-library`
    id("application")
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("io.swagger.core.v3.swagger-gradle-plugin") version "2.2.0"
}

val javaVersion = 11
val edcGroup = "org.eclipse.dataspaceconnector"
val edcVersion = "0.0.1-SNAPSHOT"
val rsApi = "3.0.0"
val swaggerJaxrs2Version = "2.1.11"

dependencies {
    implementation("$edcGroup:core-boot:$edcVersion")
    implementation("$edcGroup:core-base:$edcVersion")
    implementation("$edcGroup:http:$edcVersion")

    implementation("$edcGroup:filesystem-configuration:$edcVersion")

    implementation("$edcGroup:catalog-spi:$edcVersion")
    implementation("$edcGroup:contract-spi:$edcVersion")
    implementation("$edcGroup:transfer-spi:$edcVersion")
    implementation("$edcGroup:auth-spi:$edcVersion")

    implementation("jakarta.ws.rs:jakarta.ws.rs-api:3.1.0")
    implementation("com.auth0:java-jwt:3.19.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }
}

application {
    mainClass.set("$edcGroup.boot.system.runtime.BaseRuntime")
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    exclude("**/pom.properties", "**/pom.xm")
    mergeServiceFiles()
    archiveFileName.set("edc.jar")
}

repositories {
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://maven.iais.fraunhofer.de/artifactory/eis-ids-public/")
    }
}

buildscript {
    dependencies {
        classpath("io.swagger.core.v3:swagger-gradle-plugin:2.1.12")
    }
}

pluginManager.withPlugin("io.swagger.core.v3.swagger-gradle-plugin") {

    dependencies {
        implementation("io.swagger.core.v3:swagger-jaxrs2-jakarta:${swaggerJaxrs2Version}")
        implementation("jakarta.ws.rs:jakarta.ws.rs-api:${rsApi}")
    }

    tasks.withType<io.swagger.v3.plugins.gradle.tasks.ResolveTask> {
        // this is used to scan the classpath and generate an openapi yaml file
        outputFileName = "openApi"
        outputFormat = io.swagger.v3.plugins.gradle.tasks.ResolveTask.Format.YAML
        prettyPrint = true
        classpath = java.sourceSets["main"].runtimeClasspath
        buildClasspath = classpath
        resourcePackages = setOf("org.eclipse.dataspaceconnector")
        outputDir = file("${rootProject.projectDir.path}/openapi")
        openApiFile = file("${rootProject.projectDir.path}/openapi/openApiInfo.yaml")
    }

    configurations {
        all {
            exclude(group = "com.fasterxml.jackson.jaxrs", module = "jackson-jaxrs-json-provider")
        }
    }
}

