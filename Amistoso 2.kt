fun menu(): String {
    return """
        MENU:
        1. Agregar listas
        2. Agregar lista
        3. Agregar Tarea
        4. Ver listas
        5. Ver tareas en una lista
        6. Salir
    """.trimIndent()
}


fun main(args: Array<String>) {
    var Continue = true
    val listasde = Listasde("Listas")
    do {
        println(menu())
        print("Ingrese una opcion del menu (1 - 6): ")
        val option = readLine()!!.toInt()

        when (option) {
            1 -> {
                print("Ingrese el nombre de la nueva lista de tareas: ")
                val name = readLine()!!

                if (listasde.findListasded(name) != null) {
                    println("Esta lista ya se habia agregado")
                } else {
                    val listasded = Listasded(name)
                    listasde.addListasded(Listasded)
                    println("Lista agregada exitosamente")
                }
            }
            6 -> {
                Continue = false