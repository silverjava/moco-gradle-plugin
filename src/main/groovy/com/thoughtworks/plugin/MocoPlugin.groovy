package com.thoughtworks.plugin

import com.thoughtworks.plugin.tasks.StartMocoTask
import com.thoughtworks.plugin.tasks.StopMocoTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class MocoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('startMoco', type: StartMocoTask)
        project.task('stopMoco', type: StopMocoTask)
    }
}
