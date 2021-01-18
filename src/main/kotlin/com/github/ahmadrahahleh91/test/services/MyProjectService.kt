package com.github.ahmadrahahleh91.test.services

import com.github.ahmadrahahleh91.test.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
