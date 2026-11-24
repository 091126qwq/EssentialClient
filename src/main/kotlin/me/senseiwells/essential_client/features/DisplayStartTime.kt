package me.senseiwells.essential_client.features

import me.senseiwells.essential_client.EssentialClientConfig
import net.minecraft.client.gui.Font
import net.minecraft.client.gui.GuiGraphics
import org.apache.commons.lang3.time.DurationFormatUtils

object DisplayStartTime {
    private val start = System.nanoTime()

    @JvmStatic
    fun render(graphics: GuiGraphics, font: Font) {
        if (EssentialClientConfig.instance.displayPlayTime) {
            val duration = (System.nanoTime() - this.start) / 1_000_000
            val formatted = DurationFormatUtils.formatDuration(duration, "H:mm:ss", true)
            graphics.drawString(font, formatted, 8, 8, 0xFFFFFF)
        }
    }

    internal fun load() {

    }
}
