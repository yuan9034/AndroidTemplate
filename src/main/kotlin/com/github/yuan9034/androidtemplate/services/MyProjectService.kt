package com.github.yuan9034.androidtemplate.services

import com.github.yuan9034.androidtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
