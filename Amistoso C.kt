package structure

import tareas.Tarea

class Lista (
        val name: String,
        private var tareas: ArrayList<Tarea> = ArrayList()
) {
    fun findTarea(searchCode: String): Tarea? {
        val filteredTarea = tareas.filter { it.id == searchCode }
        if (filteredTarea.count() > 0) {
            return filteredTarea[0]
        }

        return null
    }

    fun addTarea(tarea: Tarea): Boolean {
        if (findTarea(tarea.id) == null) {
            tareas.add(tarea)
            return true
        }

        return false
    }

    override fun toString(): String {
        val tareaNames = tareas.map{ it.id }.joinToString()
        return """
            Level:
                Name: $name
                Tarea: $tareaNames
        """.trimIndent()
    }
}