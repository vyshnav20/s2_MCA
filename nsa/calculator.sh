ex=""
c=1
while [ $c -gt 0 ]
do
    echo "Expression: " $ex
    read -p "Enter an expression: " input
    if [ $input = "CE" ]
    then
        break
    fi
    ex="$ex$input"
    echo $ex
    for i in $(seq 0 $((${#ex} - 1)))
    do
        char=${ex:i:1}
        if [ "$char" == "+" ]
        then
            ex=$((${ex:0:$i} $char ${ex:$((i + 1))}))
            break
        elif [ "$char" == "-" ]
        then
            ex=$((${ex:0:$i} - ${ex:$((i + 1))}))
            break
        elif [ "$char" == "*" ]
        then
            ex=$((${ex:0:$i} * ${ex:$((i + 1))}))
            break
        elif [ "$char" == "/" ]
        then
            ex=$((${ex:0:$i} / ${ex:$((i + 1))}))
            break
        fi
    done

done
