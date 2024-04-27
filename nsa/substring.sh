#!/bin/bash
read -p "Enter a string: " str
read -p "Enter starting index and no of characters: " a b
substr=${str:$a:$b}
echo "Substring: $substr"