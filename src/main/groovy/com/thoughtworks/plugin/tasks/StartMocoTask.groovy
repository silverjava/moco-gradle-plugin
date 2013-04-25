package com.thoughtworks.plugin.tasks

import com.github.dreamhead.moco.bootstrap.Main
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class StartMocoTask extends DefaultTask {
    @Input
    int port = 8081

    @Input
    File configFile

    @Input
    boolean daemon = false

    @TaskAction
    def start() {
        Main.main(['start', '-p', port, '-c', configFile.absolutePath] as String[])
        println "Started moco server at port ${port} with file ${configFile.absolutePath}"

        if (!daemon) {
            Thread.currentThread().join()
        }
    }
}
