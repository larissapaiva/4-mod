# HospitalControl

## Descrição
Este repositório contém o código-fonte de um sistema de controle hospitalar. O sistema permite gerenciar consultas médicas, fornecendo funcionalidades para adicionar, visualizar e editar consultas.

## Estrutura de Pastas e Arquivos

### bin
Esta pasta contém os arquivos binários compilados do código-fonte.

### controle
Nesta pasta, estão localizados os arquivos relacionados ao controle do sistema.

- `ControleJanelaConsulta.class`: Classe responsável pelo controle da janela de consulta.
- `Programa.class`: Classe principal do programa.

#### Descrição das Classes e Métodos:

##### ControleJanelaConsulta
Esta classe é responsável por controlar a interação entre a interface gráfica (GUI) e a lógica do sistema. Ela contém métodos para gerenciar a exibição de dados de consultas na janela de consulta, bem como para manipular eventos associados a essa interface.

- `public void exibirConsultas(List<Consulta> consultas)`: Método para exibir uma lista de consultas na janela de consulta.
- `public void adicionarConsulta(Consulta consulta)`: Método para adicionar uma nova consulta à lista exibida na janela de consulta.
- Outros métodos para manipulação de eventos e interação com a GUI.

##### Programa
Esta é a classe principal do programa. Ela inicializa e executa o sistema hospitalar.

- `public static void main(String[] args)`: Método principal que inicia a execução do programa.

### dominio
Aqui estão os arquivos relacionados aos domínios do sistema.

- `Consulta.class`: Classe que representa uma consulta médica.
- `DaoConsulta.class`: Classe responsável pelo acesso aos dados das consultas.

#### Descrição das Classes e Métodos:

##### Consulta
Esta classe representa uma consulta médica. Ela contém os atributos relevantes para uma consulta, como data, hora, paciente, médico, etc.

- Atributos:
  - `private Date data`: Data da consulta.
  - `private String paciente`: Nome do paciente.
  - Outros atributos relevantes para uma consulta médica.

##### DaoConsulta
Esta classe é responsável pelo acesso aos dados das consultas. Ela fornece métodos para recuperar, adicionar, editar e excluir consultas do sistema.

- Métodos:
  - `public List<Consulta> obterTodasConsultas()`: Retorna uma lista contendo todas as consultas registradas no sistema.
  - `public void adicionarConsulta(Consulta consulta)`: Adiciona uma nova consulta ao sistema.
  - Outros métodos para manipulação de dados de consulta.

### view
Esta pasta contém os arquivos relacionados à interface do usuário.

- `JanelaConsulta.java`: Implementação da janela de consulta.

#### Descrição das Classes e Métodos:

##### JanelaConsulta
Esta classe implementa a interface gráfica de usuário para exibir e interagir com as consultas médicas. Ela permite ao usuário visualizar, adicionar, editar e excluir consultas.

- Métodos:
  - `public void exibirConsultas(List<Consulta> consultas)`: Método para exibir uma lista de consultas na janela.
  - `public void adicionarConsulta(Consulta consulta)`: Método para adicionar uma nova consulta à lista exibida na janela.
  - Outros métodos para manipulação de eventos e interação com a GUI.

### src
Nesta pasta estão os arquivos-fonte do projeto.

#### controle
Arquivos relacionados ao controle do sistema.

- `ControleJanelaConsulta.java`: Implementação da classe de controle da janela de consulta.
- `Programa.java`: Classe principal do programa.

#### dominio
Arquivos relacionados aos domínios do sistema.

- `Consulta.java`: Definição da classe de consulta médica.
- `DaoConsulta.java`: Implementação da classe responsável pelo acesso aos dados das consultas.

#### view
Arquivos relacionados à interface do usuário.

- `JanelaConsulta.java`: Implementação da janela de consulta.

## Como Executar o Código

1. Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema.
2. Clone o repositório para o seu ambiente local.
3. Navegue até o diretório onde o repositório foi clonado.
4. Compile os arquivos-fonte usando o comando `javac`:
   ```
   javac src/controle/*.java src/dominio/*.java src/view/*.java -d bin/
   ```
5. Execute o programa compilado usando o comando `java`:
   ```
   java -cp bin controle.Programa
   ```
6. O programa será iniciado e a interface gráfica do usuário será exibida, permitindo interação com as funcionalidades do sistema de controle hospitalar.
