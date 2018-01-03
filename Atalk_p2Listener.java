// Generated from Atalk_p2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Atalk_p2Parser}.
 */
public interface Atalk_p2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Atalk_p2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Atalk_p2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(Atalk_p2Parser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(Atalk_p2Parser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(Atalk_p2Parser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(Atalk_p2Parser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(Atalk_p2Parser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(Atalk_p2Parser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Atalk_p2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Atalk_p2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Atalk_p2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Atalk_p2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void enterStm_if_elseif_else(Atalk_p2Parser.Stm_if_elseif_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_if_elseif_else}.
	 * @param ctx the parse tree
	 */
	void exitStm_if_elseif_else(Atalk_p2Parser.Stm_if_elseif_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void enterStm_foreach(Atalk_p2Parser.Stm_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_foreach}.
	 * @param ctx the parse tree
	 */
	void exitStm_foreach(Atalk_p2Parser.Stm_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Atalk_p2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Atalk_p2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Atalk_p2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Atalk_p2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void enterStm_vardef(Atalk_p2Parser.Stm_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_vardef}.
	 * @param ctx the parse tree
	 */
	void exitStm_vardef(Atalk_p2Parser.Stm_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void enterStm_tell(Atalk_p2Parser.Stm_tellContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_tell}.
	 * @param ctx the parse tree
	 */
	void exitStm_tell(Atalk_p2Parser.Stm_tellContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_write}.
	 * @param ctx the parse tree
	 */
	void enterStm_write(Atalk_p2Parser.Stm_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_write}.
	 * @param ctx the parse tree
	 */
	void exitStm_write(Atalk_p2Parser.Stm_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void enterStm_quit(Atalk_p2Parser.Stm_quitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_quit}.
	 * @param ctx the parse tree
	 */
	void exitStm_quit(Atalk_p2Parser.Stm_quitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_break}.
	 * @param ctx the parse tree
	 */
	void enterStm_break(Atalk_p2Parser.Stm_breakContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_break}.
	 * @param ctx the parse tree
	 */
	void exitStm_break(Atalk_p2Parser.Stm_breakContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStm_assignment(Atalk_p2Parser.Stm_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#stm_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStm_assignment(Atalk_p2Parser.Stm_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Atalk_p2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Atalk_p2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(Atalk_p2Parser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(Atalk_p2Parser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(Atalk_p2Parser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(Atalk_p2Parser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_tmp(Atalk_p2Parser.Expr_or_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_tmp(Atalk_p2Parser.Expr_or_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(Atalk_p2Parser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(Atalk_p2Parser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_tmp(Atalk_p2Parser.Expr_and_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_tmp(Atalk_p2Parser.Expr_and_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(Atalk_p2Parser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(Atalk_p2Parser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_tmp(Atalk_p2Parser.Expr_eq_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_tmp(Atalk_p2Parser.Expr_eq_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(Atalk_p2Parser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(Atalk_p2Parser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_tmp(Atalk_p2Parser.Expr_cmp_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_tmp(Atalk_p2Parser.Expr_cmp_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(Atalk_p2Parser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(Atalk_p2Parser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(Atalk_p2Parser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(Atalk_p2Parser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(Atalk_p2Parser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(Atalk_p2Parser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(Atalk_p2Parser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(Atalk_p2Parser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_un}.
	 * @param ctx the parse tree
	 */
	void enterExpr_un(Atalk_p2Parser.Expr_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_un}.
	 * @param ctx the parse tree
	 */
	void exitExpr_un(Atalk_p2Parser.Expr_unContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem(Atalk_p2Parser.Expr_memContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_mem}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem(Atalk_p2Parser.Expr_memContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mem_tmp(Atalk_p2Parser.Expr_mem_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_mem_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mem_tmp(Atalk_p2Parser.Expr_mem_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Atalk_p2Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(Atalk_p2Parser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link Atalk_p2Parser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(Atalk_p2Parser.Expr_otherContext ctx);
}