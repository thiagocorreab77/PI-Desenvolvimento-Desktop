Com base nas informações coletadas, procuramos entender qual melhor forma para organizar e gerenciar as ordens de serviço de manutenção de forma eficiente e também como organizar a parte de custos, especialmente quando se tem muitas máquinas e falhas a serem atendidas, algumas informações podem se perder e com isso foi criado no Java um forma rápida, simples porém eficaz. Isso exige um fluxo de trabalho bem definido para a criação, atribuição, acompanhamento e fechamento das ordens de serviço.

Curiosidade: Junção no Git com a versão principal "main" com a ramificação branch atualizada de "partTHI"

******- Programação Orientada a Objetos/PI-Desenvolvimento-Desktop-main (partTHI)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

******- Programação Orientada a Objetos/PI-Desenvolvimento-Desktop-main (main)
$ git merge partTHI
Updating e50390f..19d74bd
Fast-forward
 Readme.md             |  80 ++++++++++++++++++++++++++++++++++++++++++++++++--
 bin/Cliente.class     | Bin 1319 -> 707 bytes
 bin/Equipamento.class | Bin 1428 -> 1622 bytes
 bin/Main.class        | Bin 1725 -> 2057 bytes
 bin/Manutencao.class  | Bin 1537 -> 1815 bytes
 src/Cliente.java      |  16 ++++------
 src/Equipamento.java  |  12 +++++---
 src/Main.java         |  44 ++++++++++++++++-----------
 src/Manutencao.java   |  16 ++++++----
 9 files changed, 128 insertions(+), 40 deletions(-)

******- Programação Orientada a Objetos/PI-Desenvolvimento-Desktop-main (main)
$ git push origin main
Enumerating objects: 6, done.
Counting objects: 100% (6/6), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 717 bytes | 717.00 KiB/s, done.
Total 4 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/thiagocorreab77/PI-Desenvolvimento-Desktop.git
   e50390f..19d74bd  main -> main

****** Programação Orientada a Objetos/PI-Desenvolvimento-Desktop-main (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean

