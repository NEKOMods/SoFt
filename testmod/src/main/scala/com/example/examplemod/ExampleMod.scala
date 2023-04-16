package com.example.examplemod

import com.mojang.logging.LogUtils
import net.minecraft.client.Minecraft
import net.minecraftforge.api.distmarker.Dist
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.server.ServerStartingEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent

final val MODID = "examplemod"
val LOGGER = LogUtils.getLogger

@Mod(MODID)
class ExampleMod {
  MinecraftForge.EVENT_BUS.register(this)

  @SubscribeEvent
  def onServerStarting(event: ServerStartingEvent): Unit = {
    LOGGER.info("HELLO from server starting")
  }
}

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Array(Dist.CLIENT))
class ClientModEvents
object ClientModEvents {
  @SubscribeEvent
  @scala.annotation.static def onClientSetup(event: FMLClientSetupEvent): Unit = {
    LOGGER.info("HELLO FROM CLIENT SETUP")
    LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance.getUser.getName)
  }
}
