package org.rsmod.game.config

import java.nio.file.Path

public data class GameConfig(
    val name: String,
    val world: Int,
    val dataPath: Path
) {

    val cachePath: Path
        get() = dataPath.resolve("cache/packed")

    val rsaPath: Path
        get() = dataPath.resolve("rsa/game.key")
}
