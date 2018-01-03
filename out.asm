main:
li $sp, 2147479880
li $t6, 2147483644
li $t1, 285282577
li $t2, 268505361
li $t9, 268443648
li $gp, 4096
li $t8 , 0
move $fp, $sp
addiu $fp, $sp, 4 #variable a declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1
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
LOOP0: beq $a1, $a0, CONTINUE1
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP0
CONTINUE1: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
addiu $fp, $sp, 8 #variable b declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
# start of adding variable a to stack
addiu $a0, $sp, 0
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable a to stack

lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 1
LOOP1: beq $a1, $a0, CONTINUE2
lw $s0, 0($s2)
lw $s1, 0($s3)
xor $s5, $s0, $s1
xori $s5, $s5, 1
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, 4
addiu $s3, $s3, -4
j LOOP1
CONTINUE2: nop
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
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
LOOP2: beq $a1, $a0, CONTINUE3
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP2
CONTINUE3: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
li $s4, 1
li $s4, 1
#adding character a to stack
#adding const integer 97 to stack
#and adding its pointer to stack
li $a0, 97
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1
#adding character b to stack
#adding const integer 98 to stack
#and adding its pointer to stack
li $a0, 98
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
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
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
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
#write started and its type is char_array
li $v0, 11
lw $a3, -4($fp)
li $a2, 2
li $a1, 0
LOOP5: beq $a1, $a2, CONTINUE6
lw $a0, 0($a3)
syscall
addiu $a1, $a1, 1
addiu $a3, $a3, 4
j LOOP5
CONTINUE6: nop
#printing new line
li $a0, 10
li $v0, 11
syscall
#write complete
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $s4, 1
# start of adding variable b to stack
addiu $a0, $sp, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable b to stack

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
