plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.3.8"
}

dependencies {
    paperDevBundle("1.18.2-R0.1-SNAPSHOT")

    compileOnly("net.civmc.civmodcore:CivModCore:2.4.0:dev-all")
    compileOnly("net.civmc.namelayer:NameLayer:3.1.0:dev")
    compileOnly("net.civmc.civchat2:CivChat2:2.1.0:dev")
    compileOnly("me.neznamy:tab-api:3.0.2")
}
