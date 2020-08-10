# Projeto Entra 21 - Material de Java e Angular
Exemplos funcionais, tutoriais e execícios.

Antes de entrar nos tópicos tenha configurado seu ambiente do Git, conforme o manual postado [aqui](https://github.com/capristano/e21-java-angular/blob/master/documents/Versionamento%20GIT.pdf).

## Java

### Objetivo
A idéia geral do curso para o aprendizado em java é aprender o básico da linguagem, para então seguir um estudo direcionado na criação de um WebServices e conexão a banco de dados.

### Requisitos
Iremos utilizar a IDE Eclipse para codificar em Java, junto com o framework de dependências Maven.

Faça o download e instale o JDK (https://www.oracle.com/java/technologies/javase-downloads.html).
Faça o download e instale o Eclipse (https://www.eclipse.org/downloads/).
Tendo baixado o installer do Eclipse, selecione a versão 'Eclipse IDE for Enterprise Java Developers' e instale.
Tendo feito isso abra o Eclipse, ao fazer isso será solicitado que você abra um diretório como workspace.
Selecione um diretório que na seja diretamente seu disco local como exemplo 'C:\src\eclipse-workspace', clique em 'launch'.
Feito isso clique em 'File > New > Maven Project'. Aparecerá uma nova janela, clique em 'Browse' em seguida selecione outro diretório para seus fontes, sendo dentro do repositório do git, por exemplo 'C:\src\Fontes\E21\e21-java-angular', então clique em 'Next', em 'Catalog' selecione 'Internal', na lista abaixo selecione maven-archetype-quickstart, clique em 'Next'.
Em 'Group Id' escreva 'e21', em 'Artifact Id' escreva 'api', em 'Version' escreva '1.0', clique em 'Finish' e aguarde.
Feche a janela de boas vindas, no explorador de pastas que abriu a esquerda, encontre o arquivo 'App.java', clique com o botão direito sobre ele, em seguida em 'Run As > Java Application', e seu projeto demo em Java está pronto no Eclipse.


## Angular

### Objetivo
A idéia geral do curso para angular, é a criação de componentes visuais basicos, e a conexão com o WebServices criado.

### Requisitos
Iremos utilizar a IDE Visual Studio Code para codificar, para gerenciar as dependências deste projeto iremos utilizar a ferramenta NPM do utilitário Node.

Baixe e instale o Visual Studio Code (https://code.visualstudio.com/download).
Baixe e instale o Node (https://nodejs.org/en/download/), só então você conseguirá utilizar o instalar o NPM.

Instale o NPM usando o seguinte comando em seu terminal em modo de administrador:
```
npm install npm -g
```

Então para instalar o Angular utilize o seguinte comando:
```
npm install -g @angular/cli
```

Com o angular instalado, dentro do seu repositório do git, crie seu projeto com o seguinte comando:
```
ng new app
```

Entre na pasta do projeto:
```
cd app
```

Agora deixe seu sistema no ar, dentro da pasta do projeto execute o comando:
```
ng serve --open
```

Este comando abriu seu browser, já com uma demo para seu novo projeto em Angular, agora iremos codificar em aula.
Caso seus sitema não seja aberto automaticamente, pode ter havido algum erro, mas primeiro tente acessar manualmente o endereço [http://localhost:4200/](http://localhost:4200/).
