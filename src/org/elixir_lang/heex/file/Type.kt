package org.elixir_lang.heex.file

import com.intellij.openapi.fileTypes.LanguageFileType

class Type : org.elixir_lang.eex.file.Type() {
    override fun getName(): String = "HTML Embedded Elixir"
    override fun getDisplayName(): String = "HEEx"
    override fun getDescription(): String = "HTML Embedded Elixir file"
    override fun getDefaultExtension(): String = "heex"

    companion object {
        val INSTANCE: LanguageFileType = Type()
    }
}
