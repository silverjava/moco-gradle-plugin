package com.thoughtworks.plugin.tasks

import com.github.dreamhead.moco.bootstrap.Main
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class StopMocoTask extends DefaultTask {

    @TaskAction
    void stop() {
        Main.main(['shutdown'] as String[])
    }

}
