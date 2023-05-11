package org.rsmod.plugins.api.net.builder.upstream

import io.netty.buffer.ByteBuf
import org.rsmod.game.protocol.packet.UpstreamPacket

public data class UpstreamPacketStructure<T : UpstreamPacket>(
    val opcode: Int,
    val length: Int,
    val decoder: (ByteBuf) -> T
)
