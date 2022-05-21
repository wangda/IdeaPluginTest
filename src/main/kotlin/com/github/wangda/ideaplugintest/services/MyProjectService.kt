package com.github.wangda.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.wangda.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
