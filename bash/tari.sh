#!/bin/bash

# Empaquetar
tar -cvf arch.tar arch1 arch2 arch3

# Desempaquetar
tar -xvf arch.tar

# Comprimir
gzip arch.tar

# Descomprimir
gzip -d arch.tar.gz

# Empaquetar y Comprimir
tar -cvzf arch.tar.gz arch1 arch2 arch3

# Desempaquetar y Descomprimir
tar -xvzf arch.tar.gz