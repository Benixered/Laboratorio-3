package Listasde

import structure.Stage

class Listasde (
        val name: String,
        private var listasdeds: ArrayList<Stage> = ArrayList()
) {
    fun findStage(searchName: String): Listasded? {
        val filteredListasdeds = listasdeds.filter { it.name == searchName }
        if (filteredListasdeds.count() > 0) {
            return filteredListasdeds[0]
        }

        return null
    }

    fun addStage(listasded: Listasded): Boolean {
        if (findListasded(listasded.name) == null) {
            listasdeds.add(listasded)
            return true
        }

        return false
    }

    override fun toString(): String {
        val listasdedNames = listasdeds.joinToString()
        return """
            Listasded:
                Name: $name
                Listasdeds: $listasdedNames
        """.trimIndent()
    }
}