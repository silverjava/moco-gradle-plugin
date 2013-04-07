package com.thoughtworks.plugin

import com.thoughtworks.plugin.tasks.StartMocoTask
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertTrue

class MocoPluginTest {
    Project project = ProjectBuilder.builder().build()

    @Before
    void setUp() {
        project.apply plugin: 'moco'
    }

    @Test
    void should_add_moco_plugin_to_project() {
        assertTrue(project.tasks.startMoco instanceof StartMocoTask)
    }
}
