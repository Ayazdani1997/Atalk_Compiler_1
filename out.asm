main:
li $sp, 2147479880
li $t6, 2147483644
li $t1, 285282577
li $t2, 268505361
li $t9, 268443648
li $gp, 4096
li $t8 , 0
move $fp, $sp
addiu $fp, $sp, 40 #variable b declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const string "ahmad" to stack
li $a0, 100
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 109
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const string "ahmay" to stack
li $a0, 121
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 109
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding a record to stack
li $a0, 5
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 16
LOOP0: beq $a1, $a0, CONTINUE1
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP0
CONTINUE1: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 5
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 16
LOOP1: beq $a1, $a0, CONTINUE2
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP1
CONTINUE2: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#doing assignment
li $a0, 10
lw $a2, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
move $s0, $a3
li $a1, 0
LOOP2: beq $a1, $a0, CONTINUE3
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP2
CONTINUE3: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
addiu $fp, $sp, 80 #variable a declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const string "ahmaz" to stack
li $a0, 122
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 109
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const string "ahmat" to stack
li $a0, 116
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 109
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 97
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding a record to stack
li $a0, 5
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 16
LOOP3: beq $a1, $a0, CONTINUE4
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP3
CONTINUE4: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 5
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 16
LOOP4: beq $a1, $a0, CONTINUE5
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP4
CONTINUE5: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#doing assignment
li $a0, 10
lw $a2, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
move $s0, $a3
li $a1, 0
LOOP5: beq $a1, $a0, CONTINUE6
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP5
CONTINUE6: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable b to stack
addiu $a0, $sp, 36
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable b to stack

#adding const integer 1 to stack
#and adding its pointer to stack
li $a0, 1
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#Accessing an element
#of array b
li $a1 , 0
lw $a0, -4($fp)
lw $a0, 0($a0)
li $a2, 20
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
li $a0, 1
li $a2, 0
LOOP6: beq $a2, $a0 CONTINUE7
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a2, $a2, 1
j LOOP6
CONTINUE7: lw $a0, -4($fp)
subu $a1 , $a0 , $a1
sw $a1, -4($fp)
#Access End
#write started and its type is char_array
li $v0, 11
lw $a3, -4($fp)
li $a2, 5
li $a1, 0
LOOP7: beq $a1, $a2, CONTINUE8
lw $a0, 0($a3)
syscall
addiu $a1, $a1, 1
addiu $a3, $a3, -4
j LOOP7
CONTINUE8: nop
#printing new line
li $a0, 10
li $v0, 11
syscall
#write complete
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $fp, $sp, 84 #variable d declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#adding const integer 0 to stack
#and adding its pointer to stack
li $a0, 0
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#operation notu
lw $a1, -4($fp)
lw $a1, 0($a1)
not $a0, $a1
# pop stack
addiu $fp, $fp, -4
# end of pop stack
sw $a0, 0($t6)
sw $t6, 0($fp)
addi $fp, $fp ,4
addi $t6, $t6, -4
# end of operation notu
#operation *
lw $a0, -4($fp)
lw $a0, 0($a0)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a1, -4($fp)
lw $a1, 0($a1)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
mul $a0, $a1, $a0
sw $a0, 0($t6)
sw $t6, 0($fp)
addi $fp, $fp ,4
addi $t6, $t6, -4
# end of operation *
#doing assignment
li $a0, 1
lw $a2, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
move $s0, $a3
li $a1, 0
LOOP8: beq $a1, $a0, CONTINUE9
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP8
CONTINUE9: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable d to stack
addiu $a0, $sp, 80
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable d to stack

#write started and its type is int
li $v0,1
lw $a0, -4($fp)
lw $a0, 0($a0)
syscall
#printing new line
li $a0, 10
li $v0, 11
syscall
#write complete
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $fp, $sp, 164 #variable c declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
# start of adding variable a to stack
addiu $a0, $sp, 76
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable a to stack

# start of adding variable b to stack
addiu $a0, $sp, 36
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable b to stack

#adding a record to stack
li $a0, 10
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, -36
LOOP9: beq $a1, $a0, CONTINUE10
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, 4
addiu $a1, $a1, 1
j LOOP9
CONTINUE10: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 10
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, -36
LOOP10: beq $a1, $a0, CONTINUE11
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, 4
addiu $a1, $a1, 1
j LOOP10
CONTINUE11: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#doing assignment
li $a0, 20
lw $a2, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
move $s0, $a3
li $a1, 0
LOOP11: beq $a1, $a0, CONTINUE12
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP11
CONTINUE12: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable c to stack
addiu $a0, $sp, 160
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable c to stack

#adding const integer 0 to stack
#and adding its pointer to stack
li $a0, 0
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#adding const integer 0 to stack
#and adding its pointer to stack
li $a0, 0
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#Accessing an element
#of array c
li $a1 , 0
lw $a0, -8($fp)
lw $a0, 0($a0)
li $a2, 40
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
lw $a0, -4($fp)
lw $a0, 0($a0)
li $a2, 20
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
li $a0, 2
li $a2, 0
LOOP12: beq $a2, $a0 CONTINUE13
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a2, $a2, 1
j LOOP12
CONTINUE13: lw $a0, -4($fp)
subu $a1 , $a0 , $a1
sw $a1, -4($fp)
#Access End
#write started and its type is char_array
li $v0, 11
lw $a3, -4($fp)
li $a2, 5
li $a1, 0
LOOP13: beq $a1, $a2, CONTINUE14
lw $a0, 0($a3)
syscall
addiu $a1, $a1, 1
addiu $a3, $a3, -4
j LOOP13
CONTINUE14: nop
#printing new line
li $a0, 10
li $v0, 11
syscall
#write complete
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $fp, $sp, 168 #variable a declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#doing assignment
li $a0, 1
lw $a2, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
move $s0, $a3
li $a1, 0
LOOP14: beq $a1, $a0, CONTINUE15
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP14
CONTINUE15: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable a to stack
addiu $a0, $sp, 164
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable a to stack

#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#operation *
lw $a0, -4($fp)
lw $a0, 0($a0)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $a1, -4($fp)
lw $a1, 0($a1)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
mul $a0, $a1, $a0
sw $a0, 0($t6)
sw $t6, 0($fp)
addi $fp, $fp ,4
addi $t6, $t6, -4
# end of operation *
#write started and its type is int
li $v0,1
lw $a0, -4($fp)
lw $a0, 0($a0)
syscall
#printing new line
li $a0, 10
li $v0, 11
syscall
#write complete
# pop stack
addiu $fp, $fp, -4
# end of pop stack
programcomplete:
