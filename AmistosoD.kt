package structure

class lista (
        val name: String,
        private var listas: ArrayList<Lista> = ArrayList()
) {
    fun findLevel(searchName: String): Lista? {
        val filteredListas = listas.filter { it.name == searchName }
        if (filteredListas.count() > 0) {
            return filteredListas[0]
        }

        return null
    }

    fun addLevel(lista: Lista): Boolean {
        if (findLista(lista.name) == null) {
            listas.add(lista)
            return true
        }

        return false
    }

    override fun toString(): String {
        val listaNames = listas.map { it.name }.joinToString()
        return """
            Lista:
                Name: $name
                Listas: $listaNames
        """.trimIndent()
    }
}