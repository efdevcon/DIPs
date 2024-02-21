#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:DependsOn("com.github.efdevcon:DIP-checker:0.3")

import org.devcon.dipchecker.checkFolder
import java.io.File
import kotlin.system.exitProcess

try {
    println(checkFolder(File("DIPs")))
} catch (e: Exception) {
    println("Validation of DIPs failed")
    println("Reason: " + e.message)
    exitProcess(1)
}

