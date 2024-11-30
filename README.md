## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Este programa hace lo siguiente

1.	El método crearArchivo crea un archivo de texto con el nombre y contenido especificados.
2.	El método leerArchivo lee el contenido de un archivo de texto y lo devuelve como una cadena.
3.	El método compararCadenas compara dos cadenas carácter a carácter y devuelve un entero que indica cuál es mayor. Si las cadenas son iguales, devuelve 0.
4.	En el método main, creamos dos archivos de texto y leemos su contenido.
5.	Luego, llamamos al método compararCadenas para comparar el contenido de los archivos carácter a carácter.
6.	Dependiendo del resultado de la comparación, imprimimos un mensaje que indica cuál es el archivo mayor.
Ten en cuenta que este programa utiliza la clase FileWriter para crear archivos y la clase BufferedReader para leer archivos. También utiliza la clase String para manipular cadenas y la clase Math para calcular la longitud mínima de las cadenas.
