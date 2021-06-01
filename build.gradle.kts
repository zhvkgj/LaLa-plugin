import org.jetbrains.grammarkit.tasks.GenerateLexer
import org.jetbrains.grammarkit.tasks.GenerateParser

plugins {
    id("org.jetbrains.intellij") version "0.7.3"
    id("org.jetbrains.grammarkit") version "2021.1.3"
    kotlin("jvm") version "1.4.32"
    java
}


java {
    sourceSets {
        main {
            java.setSrcDirs(listOf("src/main/gen", "src/main/java"))
        }
    }
}

group = "ru.mse.itmo"
version = "1.0"
val myPluginName = "PLaLa"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "IC-2020.1"
    pluginName = myPluginName
    setPlugins("com.intellij.java")
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}
task<GenerateLexer>("generateLaLaLexer") {
    group = "generation"
    source = "src/main/grammar/_LaLaLexer.flex"
    targetDir = "src/main/gen/ru/mse/itmo/lala/language"
    targetClass = "_LaLaLexer"
    purgeOldFiles = true
}
task<GenerateParser>("generateLaLaParser") {
    group = "generation"
    source = "src/main/grammar/LaLaParser.bnf"
    targetRoot = "src/main/gen"
    pathToParser = "/ru/mse/itmo/lala/language/parser/LaLaParser.java"
    pathToPsiRoot = "/ru/mse/itmo/lala/language/psi"
    purgeOldFiles = true
}
tasks.clean {
    delete("${rootDir}/src/main/gen/ru")
}
tasks.compileJava {
    options.release.set(11)
}