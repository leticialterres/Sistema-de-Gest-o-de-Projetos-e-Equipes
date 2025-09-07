# Sistema de Gestão de Projetos e Equipes

A Oracle possui muitos clientes que possuem suas demandas de trabalho totalmente orientada a projetos. De modo geral, a necessidade frequentemente observada diz respeito ao controle mais efetivo dos projetos cujo desenvolvimento é de responsabilidade dos colaboradores que exercem as funções de desenvolvedor, analista de sistemas, designer de interface. Este controle envolve a distribuição das etapas do projeto aos colaboradores, visando um melhor aproveitamento do corpo de colaboradores da empresa, assim como o acompanhamento do andamento do projeto, visando garantir os prazos de entrega contratados.
Estes clientes, ao utilizar as tecnologias Oracle, acabam por aumentar o seu portfólio de projetos, o que gera uma dificuldade na gestão dos mesmos e a distribuição das etapas a serem executadas por cada colaborador envolvido, necessitando de uma ferramenta mais adequada e específica para manter o controle do andamento do projeto, conseguindo proporcionar garantias para cumprir com prazos de entrega e melhor utilização dos profissionais que colaboram com a empresa.
Como observado, a necessidade principal é a de construir um Sistema para Gestão de Projetos e também das Equipes, objetivando uma gestão eficaz dos projetos, das tarefas para o projeto, das equipes envolvidas, prazos de entregas para os entregáveis, assim como emitir relatórios de desempenho para cada projeto.
Definição do escopo
O Projeto envolve a construção de um Sistema para Gestão de Projetos e também das Equipes, garantindo o cadastro e manutenção de usuários do sistema; de projetos; de tarefas do projeto; de equipes; de alocação das equipes nos projetos; de relatórios de acompanhamento dos projetos.
O Projeto deve ser desenvolvido utilizando-se a linguagem Java com interface visual (Swing, JavaFX ou similar), conectado a um banco de dados MySQL. O sistema deverá ter diferentes perfis de acesso (ex: administrador, gerente de projeto, colaborador) e permitir requisitos explícitos e implícitos.
Cadastro de Usuários
a) Nome completo, CPF, e-mail, cargo, login, senha.
b) Cada usuário deve ter um perfil: administrador, gerente ou colaborador.
2. Cadastro de Projetos
c) Nome do projeto, descrição, data de início, data de término prevista, status (planejado, em andamento, concluído, cancelado).
d) Cada projeto deve ter um gerente responsável.
3. Cadastro de Equipes
e) Nome da equipe, descrição, membros (usuários vinculados).
f) Uma equipe pode atuar em vários projetos.
4. Alocação de Equipes a Projetos
g) Um projeto pode ter mais de uma equipe envolvida.
h) Uma equipe pode atuar em mais de um projeto.
5. Cadastro de Tarefas
i) Título, descrição, projeto vinculado, responsável (usuário), status (pendente, em execução, concluída), data de início e fim previstas e reais.
j) Cada tarefa pertence a um único projeto.
6. Relatórios e Dashboards
k) Resumo de andamento dos projetos.
l) Desempenho de cada colaborador (tarefas atribuídas e concluídas).
m) Projetos com risco de atraso (data atual > data prevista de término).
7. Autenticação
n) Tela de login com validação no banco de dados.
8. Interface visual amigável
o) Prototipar telas antes de codificar.
p) Interface deve permitir fácil navegação, cadastro, edição e visualização dos dados.
1.	Requisitos implícitos Como será feita a vinculação entre tarefas, projetos e colaboradores?
2.	É possível que um colaborador esteja em mais de uma equipe?
3.	O que acontece com as tarefas se o projeto for cancelado?
4.	Será necessário histórico de alterações nos status das tarefas?
5.	Como controlar quem pode alterar o quê, com base no perfil do usuário?
6.	De que forma será feito o relacionamento entre tabelas no banco?
7.	Qual a melhor forma de organizar os pacotes da aplicação Java?
8.	Haverá necessidade de logs de acesso ou atividades do sistema?
9.	Qual o tratamento ideal para campos obrigatórios e validações de formulário?

Abertura
Nesta etapa, vamos estabelecer os planos para a proposta que você decidiu desenvolver. O planejamento é uma fase essencial no desenvolvimento de soluções computacionais. Isso requer estabelecer uma estratégia coesa antes de iniciar a programação.
Padrão de arquitetura
•	Vídeos
•	Glossário
•	Arquivos / Links
O padrão arquitetônico MVC (Model-View-Controller) é uma estrutura que organiza aplicativos em três componentes interligados. De acordo com o site Le Wagon, "embora muitas pessoas considerem a sigla MVC como um padrão de design de interface, na realidade, ele é um padrão de arquitetura de software responsável por contribuir para a otimização da velocidade entre as requisições feitas pelo comando dos usuários".
 
Essa divisão facilita a manutenção, escalabilidade e colaboração em projetos, pois permite que diferentes partes do aplicativo sejam modificadas independentemente. O MVC é amplamente utilizado no desenvolvimento de software para criar sistemas mais organizados e flexíveis.
Levantamento de requisitos
Os requisitos de software são descrições minuciosas das funcionalidades, características e limitações que um sistema precisa possuir. Eles oferecem diretrizes bem definidas para o desenvolvimento, ajudando a equipe a compreender exatamente o que precisa ser alcançado e a evitar qualquer tipo de mal-entendido. Os requisitos podem ser classificados como funcionais (descrevendo o que o sistema realiza) ou não funcionais (abordando aspectos como desempenho, segurança e facilidade de uso).
Componentes tecnológicos
•	Vídeos
•	Glossário
•	Arquivos / Links
A dimensão tecnológica é um termo utilizado para descrever os componentes tecnológicos e hardware utilizados nos sistemas de informação. Esses componentes incluem servidores, redes, bancos de dados, softwares e dispositivos de entrada/saída.
Liste os componentes tecnológicos e hardware que você utilizará para desenvolver a sua solução. Certifique-se de fornecer as informações necessárias para que o seu projeto seja bem compreendido e executado.
Usuários
Os aspectos humanos relacionados aos sistemas de informação dizem respeito aos usuários finais, analistas de sistemas e desenvolvedores, assim como ao impacto humano no projeto, implementação e uso desses sistemas.
Indique quem serão os usuários do projeto e onde eles se enquadram. Por exemplo, se são usuários finais, desenvolvedores, entre outros.

Plano de ação
•	Vídeos
•	Glossário
•	Arquivos / Links
Vamos preencher o plano de ação para o seu estabelecimento. Aqui você irá identificar e listar as principais tarefas do plano tendo como base os processos para desenvolver uma solução computacional. Um bom planejamento ajuda a economizar tempo e esforço ao longo do processo de desenvolvimento e pode levar a um código mais eficiente e de melhor qualidade.
Tarefa
Qual é a ação a tomar?
Responsável
Quem será o responsável por essa tarefa?
Data de início
Qual a previsão de início da tarefa?
Data de fim
Qual a previsão de finalização da tarefa?
Recursos
Quais recursos são necessários para executar cada tarefa?
Os recursos podem ser:
•	Recursos materiais (exemplo: papel, computador, câmera, roteiro de entrevista, etc.)
•	Recursos humanos (exemplo: técnicos para executar novos processos).
A avaliação será conduzida de forma abrangente, não se limitando apenas à entrega final. Portanto, é obrigatório que os grupos apresentem relatórios semanais de desenvolvimento e atuem como assessores do projeto junto aos professores. Além disso, é necessário apresentar a proposta de sprint backlog para a semana em curso.
Fazer um cronograma e segui-lo é fundamental. Importante que as tarefas sejam divididas entre os membros da equipe a fim de que todos participem e um não fique mais sobrecarregado do que o outro.

Para isso, indique abaixo as tarefas que precisará realizar e, para cada uma delas, atribua um responsável, estime as datas de início e de fim e defina os recursos que precisará para completá-la.

Seu plano de ação
•	Vídeos
•	Glossário
•	Arquivos / Links
Este é o resultado do seu plano de trabalho!

Lembre-se de que o planejamento não precisa ser rígido. À medida que você começa a implementar a solução, é possível encontrar insights que o levem a ajustar o plano original. A flexibilidade é importante, mas ter um planejamento sólido como ponto de partida é fundamental para o sucesso do desenvolvimento.
Pesquisa e planejamento da solução proposta
Nesta etapa, você irá criar o Diagrama de Classes UML, refletindo as entidades do sistema e seus relacionamentos. Também irá projetar o banco de dados MySQL, desenvolvendo o modelo ER normalizado que servirá para a criação de tabelas, chaves primárias e estrangeiras. Aqui você pode usar o material de apoio da ORACLE.
Objetivos de aprendizagem
•	Elaborar Diagrama de Classes
•	Elaborar Diagrama ER
Diagrama de classes
Um diagrama de classes é uma representação visual da estrutura e das relações das classes em um sistema orientado a objetos. Ele é uma ferramenta fundamental na modelagem de software, sendo utilizada para ilustrar a organização das classes, seus atributos, métodos e as associações entre elas.
 

Os diagramas de classes são amplamente empregados durante a fase de design de software para visualizar a estrutura do sistema e as relações entre suas partes. Eles auxiliam na comunicação clara e concisa dos conceitos do sistema para desenvolvedores, arquitetos e demais envolvidos no projeto.
Desenvolvimento da Solução
Estudante, parabéns pela jornada que você percorreu até agora! Sei que não foi uma jornada fácil, mas os esforços valeram a pena.

Agora chegou o momento de concluir o seu projeto e apresentar o produto finalizado. Para isso, certifique-se de ter atendido todos os critérios:
•	Construção e correto uso das estruturas, comandos e técnicas
•	Clareza, estilo e boas práticas no código, incluindo comentários
•	Correta execução do programa

