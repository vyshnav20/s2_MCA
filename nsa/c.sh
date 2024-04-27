#!/bin/bash
while true
do	
	read -p "Enter 2 numbers: " a b
	read -p "Enter the operator: " op
	case $op in
		"+")
			ans=$(( $a + $b ));;
		"-")
			ans=$(( $a - $b ));;
		"*")
			ans=$(( $a * $b ));;
		"/")
			ans=$(( $a / $b ));;
		*)
			exit 1;;
	esac
	echo "$a $op $b = $ans"
done