#!/bin/bash
i="y"
read -p "Enter name of database: " db
while [ $i = "y" ]
do
    clear
    echo "1. View Database"
    echo "2. View Specific Record"
    echo "3. Add Record"
    echo "4. Delete Record"
    echo "5. Exit"
    read -p "Enter your choicce: " ch
    case $ch in
    1) cat $db;;
    2) read -p "Enter ID: " id
       grep -i "$id" $db;;
    3) read -p "Enter new student ID: " tid
       read -p "Enter new name: " nm
       read -p "Enter designation: " des
       read -p "Enter college name: " college
       echo "$tid $nm $des $college">>$db;;
    4) read -p "Enter ID: " id
       grep -v "$id" $db > dbs1
       echo "Record is deleted"
       cat dbs1;;
    5) exit ;;
    *) echo "Invalid choice";;
    esac
    read -p "Do ypu want to continue? " i
    if [ $i != "y" ]
    then
        exit
    fi
done






