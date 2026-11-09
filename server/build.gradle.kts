plugins {
    application
}

dependencies {
    implementation(project(":protocol"))
}

application {
    mainClass = "io.github.notkiruzu.stratum.server.Main"
}