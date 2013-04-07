package com.thoughtworks.plugin

import com.thoughtworks.plugin.tasks.StartMocoTask
import com.thoughtworks.plugin.tasks.StopMocoTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration

class MocoPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        Configuration config = project.configurations.add('moco')
        config.dependencies.add('com.github.dreamhead:moco-runner:0.6.3-SNAPSHOT')

        project.task('startMoco', type: StartMocoTask)
        project.task('stopMoco', type: StopMocoTask)
    }
}
