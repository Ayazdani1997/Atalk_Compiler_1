.data
invalidmsgmsg : .asciiz "InvalidMessageError"
actorMBfullmsg : .asciiz "ActorBufferOverflowError"
indexOutOfRange :  .asciiz "indexOutOfRangeException"
.text
main:
li $sp, 2147481592
li $t6, 2147483644
li $t1, 285282577
li $t2, 268505361
li $t9, 268443648
li $gp, 4096
li $t8 , 1
move $fp, $sp
# adding an actor
li $a0, 4
sw $a0, 0($t1)
move $t3,$t1
addi $t3,$t3, 12
sw $t3, 4($t1)
move $t3,$t1
addi $t3,$t3, 28
sw $t3, 8($t1)
#actor added
#putting init message in actor sadramailbox
li $t3, 0
add $t3 ,$t3,$t1
sw $zero , 20($t3)
li $t5, 0
sw $t5 , 24($t3)
#init message put
j superwhile
init0:
addiu $fp, $sp, 48 #variable a declaration
addiu $a0, $fp, -4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#adding const string "ahy" to stack
li $a0, 121
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
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "tyh" to stack
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 121
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 116
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
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
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
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
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "hot" to stack
li $a0, 116
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 111
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "hoy" to stack
li $a0, 121
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 111
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP2: beq $a1, $a0, CONTINUE3
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP2
CONTINUE3: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
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
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 6
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 20
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
li $a0, 6
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 20
LOOP5: beq $a1, $a0, CONTINUE6
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP5
CONTINUE6: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#doing assignment
li $a0, 12
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
LOOP6: beq $a1, $a0, CONTINUE7
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP6
CONTINUE7: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable a to stack
addiu $a0, $sp, 44
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable a to stack

li $s4, 1 #compare started
#adding const string "ahy" to stack
li $a0, 121
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
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "tyh" to stack
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 121
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 116
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP7: beq $a1, $a0, CONTINUE8
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP7
CONTINUE8: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP8: beq $a1, $a0, CONTINUE9
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP8
CONTINUE9: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "hot" to stack
li $a0, 116
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 111
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const string "hoy" to stack
li $a0, 121
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 111
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 104
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP9: beq $a1, $a0, CONTINUE10
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP9
CONTINUE10: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP10: beq $a1, $a0, CONTINUE11
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP10
CONTINUE11: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 6
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 20
LOOP11: beq $a1, $a0, CONTINUE12
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP11
CONTINUE12: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 6
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 20
LOOP12: beq $a1, $a0, CONTINUE13
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP12
CONTINUE13: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 12
LOOP13: beq $a1, $a0, CONTINUE14
lw $s0, 0($s2)
lw $s1, 0($s3)
xor $s5, $s0, $s1
beq $s5, 0, CONTINUE15
li $s5, 1
CONTINUE15: nop
xori $s5, $s5, 1
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, -4
addiu $s3, $s3, 4
j LOOP13
CONTINUE14: nop
xori $s4, $s4, 1
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
#end of equality
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
addiu $fp, $sp, 52 #variable b declaration
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
#adding const integer 5 to stack
#and adding its pointer to stack
li $a0, 5
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 1
LOOP15: beq $a1, $a0, CONTINUE16
lw $s0, 0($s2)
lw $s1, 0($s3)
slt $s5, $s1, $s0
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, 4
addiu $s3, $s3, 4
j LOOP15
CONTINUE16: nop
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
#end of compare
#adding const integer 0 to stack
#and adding its pointer to stack
li $a0, 0
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 1
LOOP16: beq $a1, $a0, CONTINUE17
lw $s0, 0($s2)
lw $s1, 0($s3)
xor $s5, $s0, $s1
beq $s5, 0, CONTINUE18
li $s5, 1
CONTINUE18: nop
xori $s5, $s5, 1
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, -4
addiu $s3, $s3, 4
j LOOP16
CONTINUE17: nop
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
#end of equality
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
LOOP18: beq $a1, $a0, CONTINUE19
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP18
CONTINUE19: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable b to stack
addiu $a0, $sp, 48
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable b to stack

li $s4, 1 #compare started
li $s4, 1 #equality started
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
addiu $fp, $sp, 88 #variable c declaration
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
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 5 to stack
#and adding its pointer to stack
li $a0, 5
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP19: beq $a1, $a0, CONTINUE20
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP19
CONTINUE20: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP20: beq $a1, $a0, CONTINUE21
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP20
CONTINUE21: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP21: beq $a1, $a0, CONTINUE22
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP21
CONTINUE22: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 4 to stack
#and adding its pointer to stack
li $a0, 4
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP22: beq $a1, $a0, CONTINUE23
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP22
CONTINUE23: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP23: beq $a1, $a0, CONTINUE24
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP23
CONTINUE24: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP24: beq $a1, $a0, CONTINUE25
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP24
CONTINUE25: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 5 to stack
#and adding its pointer to stack
li $a0, 5
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 6 to stack
#and adding its pointer to stack
li $a0, 6
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP25: beq $a1, $a0, CONTINUE26
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP25
CONTINUE26: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP26: beq $a1, $a0, CONTINUE27
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP26
CONTINUE27: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP27: beq $a1, $a0, CONTINUE28
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP27
CONTINUE28: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP28: beq $a1, $a0, CONTINUE29
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP28
CONTINUE29: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP29: beq $a1, $a0, CONTINUE30
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP29
CONTINUE30: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP30: beq $a1, $a0, CONTINUE31
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP30
CONTINUE31: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#doing assignment
li $a0, 9
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
LOOP31: beq $a1, $a0, CONTINUE32
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP31
CONTINUE32: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable c to stack
addiu $a0, $sp, 84
sw $a0, 0($fp)
addiu $fp, $fp, 4
# end of adding variable c to stack

li $s4, 1 #compare started
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 5 to stack
#and adding its pointer to stack
li $a0, 5
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP32: beq $a1, $a0, CONTINUE33
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP32
CONTINUE33: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP33: beq $a1, $a0, CONTINUE34
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP33
CONTINUE34: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP34: beq $a1, $a0, CONTINUE35
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP34
CONTINUE35: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 4 to stack
#and adding its pointer to stack
li $a0, 4
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP35: beq $a1, $a0, CONTINUE36
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP35
CONTINUE36: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP36: beq $a1, $a0, CONTINUE37
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP36
CONTINUE37: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP37: beq $a1, $a0, CONTINUE38
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP37
CONTINUE38: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 3 to stack
#and adding its pointer to stack
li $a0, 3
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 5 to stack
#and adding its pointer to stack
li $a0, 5
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 6 to stack
#and adding its pointer to stack
li $a0, 6
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP38: beq $a1, $a0, CONTINUE39
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP38
CONTINUE39: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP39: beq $a1, $a0, CONTINUE40
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP39
CONTINUE40: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 1
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 0
LOOP40: beq $a1, $a0, CONTINUE41
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP40
CONTINUE41: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding a record to stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP41: beq $a1, $a0, CONTINUE42
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP41
CONTINUE42: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP42: beq $a1, $a0, CONTINUE43
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP42
CONTINUE43: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
li $a0, 3
li $a1, 0
lw $a3, -4($fp)
addiu $a3, $a3, 8
LOOP43: beq $a1, $a0, CONTINUE44
lw $a2, 0($a3)
sw $a2, 0($t6)
addiu $t6, $t6, -4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP43
CONTINUE44: nop
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a0, $t6, 4
sw $a0, 0($fp)
addiu $fp, $fp, 4
#end of making record
li $s4, 1 #compare started
li $s4, 1 #equality started
lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 9
LOOP44: beq $a1, $a0, CONTINUE45
lw $s0, 0($s2)
lw $s1, 0($s3)
xor $s5, $s0, $s1
beq $s5, 0, CONTINUE46
li $s5, 1
CONTINUE46: nop
xori $s5, $s5, 1
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, -4
addiu $s3, $s3, 4
j LOOP44
CONTINUE45: nop
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
#end of equality
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
# start of adding variable c to stack
addiu $a0, $sp, 84
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
li $s4, 1 #compare started
li $s4, 1 #equality started
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#Accessing an element
#of array c
li $a1 , 0
lw $a0, -8($fp)
lw $a0, 0($a0)
li $a2, 12
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
lw $a0, -4($fp)
lw $a0, 0($a0)
li $a2, 4
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
li $a0, 2
li $a2, 0
LOOP46: beq $a2, $a0 CONTINUE47
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a2, $a2, 1
j LOOP46
CONTINUE47: lw $a0, -4($fp)
subu $a1 , $a0 , $a1
sw $a1, -4($fp)
#Access End
li $s4, 1 #compare started
li $s4, 1 #equality started
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
#adding const string "over" to stack
li $a0, 114
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 101
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 118
sw $a0, 0($t6)
addiu $t6, $t6, -4
li $a0, 111
sw $a0, 0($t6)
addiu $t6, $t6, -4
addiu $a0, $t6, 4
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
li $s4, 1 #compare started
li $s4, 1 #equality started
#Accessing an element
#of array temp_const_str
li $a1 , 0
lw $a0, -4($fp)
lw $a0, 0($a0)
li $a2, 4
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
li $a0, 1
li $a2, 0
LOOP47: beq $a2, $a0 CONTINUE48
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a2, $a2, 1
j LOOP47
CONTINUE48: lw $a0, -4($fp)
addu $a1, $a0, $a1
sw $a1, -4($fp)
#Access End
li $s4, 1 #compare started
#adding character e to stack
#adding const integer 101 to stack
#and adding its pointer to stack
li $a0, 101
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
lw $s3, -4($fp)
# pop stack
addiu $fp, $fp, -4
# end of pop stack
lw $s2, -4($fp)
li $a1, 0
li $a0, 1
LOOP48: beq $a1, $a0, CONTINUE49
lw $s0, 0($s2)
lw $s1, 0($s3)
xor $s5, $s0, $s1
beq $s5, 0, CONTINUE50
li $s5, 1
CONTINUE50: nop
xori $s5, $s5, 1
and $s4, $s4, $s5
addiu $a1, $a1, 1
addiu $s2, $s2, -4
addiu $s3, $s3, 4
j LOOP48
CONTINUE49: nop
sw $s4, 0($t6)
addiu $fp, $fp, -4
sw $t6, 0($fp)
addiu $fp, $fp, 4
addiu $t6, $t6, -4
#end of equality
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
addiu $fp, $sp, 4 #variable a declaration
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
li $s4, 1 #compare started
li $s4, 1 #equality started
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
LOOP50: beq $a1, $a0, CONTINUE51
lw $s6, 0($a2) #loading value of right hand side of assignment
sw $s6, 0($a3) #storing value of right hand side 
addiu $a2, $a2, 4
addiu $a3, $a3, -4
addiu $a1, $a1, 1
j LOOP50
CONTINUE51: nop
sw $s0, 0($fp)
addiu $fp, $fp, 4
#end of assignment
# start of adding variable a to stack
addiu $a0, $sp, 0
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
li $s4, 1 #compare started
li $s4, 1 #equality started
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
#read started
li $a2, 0
addiu $t6, $t6, -20
addiu $a1, $t6, 4
LOOP51: beq $a2, 5, CONTINUE52
li $v0,12
syscall
sw $v0, 0($a1)
addiu $a1, $a1, 4
addiu $a2, $a2, 1
j LOOP51
CONTINUE52: addiu $a2, $t6, 4
addiu $a2, $t6, 4
sw $a2 , 0($fp)
addiu $fp, $fp, 4
#read completed
#printing new line
li $a0, 10
li $v0, 11
syscall
#adding const integer 2 to stack
#and adding its pointer to stack
li $a0, 2
sw $a0, 0($t6)
sw $t6, 0($fp)
addiu $t6, $t6, -4
addiu $fp, $fp, 4
#end of adding a const integer to stack
li $s4, 1 #compare started
li $s4, 1 #equality started
#Accessing an element
#of array temp_read
li $a1 , 0
lw $a0, -4($fp)
lw $a0, 0($a0)
li $a2, 4
multu $a0, $a2
mflo $a0
addu $a1, $a1, $a0
li $a0, 1
li $a2, 0
LOOP52: beq $a2, $a0 CONTINUE53
# pop stack
addiu $fp, $fp, -4
# end of pop stack
addiu $a2, $a2, 1
j LOOP52
CONTINUE53: lw $a0, -4($fp)
addu $a1, $a0, $a1
sw $a1, -4($fp)
#Access End
li $s4, 1 #compare started
li $s4, 1 #equality started
#write started and its type is char
li $v0,11
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
jr $ra
#receiver added
#start of superwhile
superwhile :
beq $t8,$zero, programcomplete
li $a1, 5
li $a0, 0
add $a0,$a0,$t1
jal messagepicker
j superwhile
#end of superwhile
#start of messagepicker
messagepicker:
lw $t3, 0($a0)
bne $a1,$t3, hasmessage54
jr $ra
hasmessage54 :
lw $a2, 0($a0)
addi $a2,$a2,1
sw $a2, 0($a0)
addiu $t8,$t8,-1
lw $a2, 4($a0)
lw $a3, 4($a0)
addi $a3,$a3,16
li $t3,16
multu $t3,$a1
mflo $t3
add $t3,$t3,$a0
addi $t3,$t3,12
beq $a3,$t3, pointermending55
sw $a3,4($a0)
j pointermended56
pointermending55 :
addi $a3,$a0,12
sw $a3,4($a0)
pointermended56 :
addi $t3,$a2,12
lw $t3, 0($t3)
li $t5, 0
add $t5,$t5,$t1
bne $t5,$a0, not57sadra
li $t7, 0
beq $t7,$t3 , init0
not57sadra:
#end of messagepicker
programcomplete:
li $v0, 10
syscall
