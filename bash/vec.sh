#!/bin/bash

vector=($*);

function salir()
{
    exit;
}

function imprimir()
{
    echo ${vector[@]}
}

function largo()
{
    echo ${#vector[@]}
}

function push()
{
    read num
    vector=("$num" "${vector[@]}")
}

select opcion in imprimir largo push salir
do
    $opcion
done