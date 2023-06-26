#!/bin/bash

# Diretório de onde será contado a quantidade de arquivos
diretorio="/root"

# Comando "ls" é usado para listar os arquivos no diretório
# O parâmetro "-p" adiciona "/" aos diretórios na listagem
# O parâmetro "-p" evita que os diretórios sejam contados como arquivos
# O parâmetro "-1" garante que cada arquivo/diretório seja listado em uma linha separada
# O comando "wc -l" conta o número de linhas da saída do comando "ls"
quantidade=$(ls -p "$diretorio" | grep -v / | wc -l)

echo "A quantidade de arquivos em $diretorio é: $quantidade"

#sed -i -e 's/\r$//' meu_script.sh

