package org.rsmod.plugins.api.cache.type.npc

import org.openrs2.cache.Cache
import org.rsmod.plugins.api.cache.build.game.GameCache
import org.rsmod.plugins.cache.config.npc.NpcTypeList
import org.rsmod.plugins.cache.config.npc.NpcTypeLoader
import org.rsmod.plugins.cache.config.param.ParamTypeList
import com.google.inject.Inject
import com.google.inject.Provider

public class NpcTypeListProvider @Inject constructor(
    @GameCache private val cache: Cache,
    private val params: ParamTypeList
) : Provider<NpcTypeList> {

    override fun get(): NpcTypeList {
        val types = NpcTypeLoader.load(cache, params)
        return NpcTypeList(types.associateBy { it.id })
    }
}
