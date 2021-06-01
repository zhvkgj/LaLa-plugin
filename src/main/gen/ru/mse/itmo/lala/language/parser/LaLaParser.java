// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.mse.itmo.lala.language.psi.LaLaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LaLaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return languageSpecification(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '@' ident ('(' ( annotationArgument (',' annotationArgument)* (',')?)? ')')?
  public static boolean annotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ANNOTATION, "<annotation>");
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, IDENT);
    result_ = result_ && annotation_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ('(' ( annotationArgument (',' annotationArgument)* (',')?)? ')')?
  private static boolean annotation_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2")) return false;
    annotation_2_0(builder_, level_ + 1);
    return true;
  }

  // '(' ( annotationArgument (',' annotationArgument)* (',')?)? ')'
  private static boolean annotation_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && annotation_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( annotationArgument (',' annotationArgument)* (',')?)?
  private static boolean annotation_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1")) return false;
    annotation_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // annotationArgument (',' annotationArgument)* (',')?
  private static boolean annotation_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotationArgument(builder_, level_ + 1);
    result_ = result_ && annotation_2_0_1_0_1(builder_, level_ + 1);
    result_ = result_ && annotation_2_0_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',' annotationArgument)*
  private static boolean annotation_2_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!annotation_2_0_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "annotation_2_0_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' annotationArgument
  private static boolean annotation_2_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && annotationArgument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (',')?
  private static boolean annotation_2_0_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1_0_2")) return false;
    annotation_2_0_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // (',')
  private static boolean annotation_2_0_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expression
  public static boolean annotationArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ANNOTATION_ARGUMENT, "<annotation argument>");
    result_ = expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ident '.' ident
  public static boolean attributeAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeAccess")) return false;
    if (!nextTokenIs(builder_, IDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    result_ = result_ && consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, IDENT);
    exit_section_(builder_, marker_, ATTRIBUTE_ACCESS, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeAccess
  //     | localAttributeAccess
  //     | attributeLiteral
  //     | generatorValue
  public static boolean attributeAtom(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeAtom")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_ATOM, "<attribute atom>");
    result_ = attributeAccess(builder_, level_ + 1);
    if (!result_) result_ = localAttributeAccess(builder_, level_ + 1);
    if (!result_) result_ = attributeLiteral(builder_, level_ + 1);
    if (!result_) result_ = generatorValue(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // attributeModifier ident (':' attributeTypeName)? ';'
  public static boolean attributeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_DECLARATION, "<attribute declaration>");
    result_ = attributeModifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENT);
    result_ = result_ && attributeDeclaration_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (':' attributeTypeName)?
  private static boolean attributeDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDeclaration_2")) return false;
    attributeDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // ':' attributeTypeName
  private static boolean attributeDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ":");
    result_ = result_ && attributeTypeName(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeAccess '=' attributeExpression ';'
  public static boolean attributeEvaluationRule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeEvaluationRule")) return false;
    if (!nextTokenIs(builder_, IDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeAccess(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && attributeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, ATTRIBUTE_EVALUATION_RULE, result_);
    return result_;
  }

  /* ********************************************************** */
  // attributeFunctionCall
  //     | attributeAtom
  //     | childReference
  public static boolean attributeExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_EXPRESSION, "<attribute expression>");
    result_ = attributeFunctionCall(builder_, level_ + 1);
    if (!result_) result_ = attributeAtom(builder_, level_ + 1);
    if (!result_) result_ = childReference(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ident ':' ident
  //     | attributeFunctionName
  public static boolean attributeFunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_FUNCTION, "<attribute function>");
    result_ = attributeFunction_0(builder_, level_ + 1);
    if (!result_) result_ = attributeFunctionName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ident ':' ident
  private static boolean attributeFunction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    result_ = result_ && consumeToken(builder_, ":");
    result_ = result_ && consumeToken(builder_, IDENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '(' attributeFunction (attributeExpression)* ')'
  public static boolean attributeFunctionCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunctionCall")) return false;
    if (!nextTokenIs(builder_, LB)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && attributeFunction(builder_, level_ + 1);
    result_ = result_ && attributeFunctionCall_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, ATTRIBUTE_FUNCTION_CALL, result_);
    return result_;
  }

  // (attributeExpression)*
  private static boolean attributeFunctionCall_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunctionCall_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!attributeFunctionCall_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "attributeFunctionCall_2", pos_)) break;
    }
    return true;
  }

  // (attributeExpression)
  private static boolean attributeFunctionCall_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunctionCall_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '+'
  //     | '-'
  //     | '*'
  //     | '/'
  //     | '=='
  //     | '!='
  //     | '<'
  //     | '>'
  //     | '<='
  //     | '>='
  //     | ident
  public static boolean attributeFunctionName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeFunctionName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_FUNCTION_NAME, "<attribute function name>");
    result_ = consumeToken(builder_, "+");
    if (!result_) result_ = consumeToken(builder_, "-");
    if (!result_) result_ = consumeToken(builder_, "*");
    if (!result_) result_ = consumeToken(builder_, "/");
    if (!result_) result_ = consumeToken(builder_, "==");
    if (!result_) result_ = consumeToken(builder_, "!=");
    if (!result_) result_ = consumeToken(builder_, "<");
    if (!result_) result_ = consumeToken(builder_, ">");
    if (!result_) result_ = consumeToken(builder_, "<=");
    if (!result_) result_ = consumeToken(builder_, ">=");
    if (!result_) result_ = consumeToken(builder_, IDENT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // number
  //     | string
  //     | charliteral
  //     | booleanLiteral
  //     | nil
  public static boolean attributeLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeLiteral")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_LITERAL, "<attribute literal>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, CHARLITERAL);
    if (!result_) result_ = booleanLiteral(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NIL);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // INH
  //     | SYN
  //     | GRD
  public static boolean attributeModifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeModifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_MODIFIER, "<attribute modifier>");
    result_ = consumeToken(builder_, INH);
    if (!result_) result_ = consumeToken(builder_, SYN);
    if (!result_) result_ = consumeToken(builder_, GRD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ident
  public static boolean attributeTypeName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "attributeTypeName")) return false;
    if (!nextTokenIs(builder_, IDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    exit_section_(builder_, marker_, ATTRIBUTE_TYPE_NAME, result_);
    return result_;
  }

  /* ********************************************************** */
  // false | true
  public static boolean booleanLiteral(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "booleanLiteral")) return false;
    if (!nextTokenIs(builder_, "<boolean literal>", FALSE, TRUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BOOLEAN_LITERAL, "<boolean literal>");
    result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ident
  public static boolean childReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "childReference")) return false;
    if (!nextTokenIs(builder_, IDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENT);
    exit_section_(builder_, marker_, CHILD_REFERENCE, result_);
    return result_;
  }

  /* ********************************************************** */
  // productionClassDeclaration
  //     | literalClassDeclaration
  public static boolean classDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_DECLARATION, "<class declaration>");
    result_ = productionClassDeclaration(builder_, level_ + 1);
    if (!result_) result_ = literalClassDeclaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // number
  //     | string
  //     | ident
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, IDENT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (annotation)* ident attributeFunctionCall ':' attributeTypeName '{' (localAttributeDefinition)* (attributeEvaluationRule)* '}'
  public static boolean generatorProductionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERATOR_PRODUCTION_DECLARATION, "<generator production declaration>");
    result_ = generatorProductionDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IDENT);
    result_ = result_ && attributeFunctionCall(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ":");
    result_ = result_ && attributeTypeName(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && generatorProductionDeclaration_6(builder_, level_ + 1);
    result_ = result_ && generatorProductionDeclaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (annotation)*
  private static boolean generatorProductionDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!generatorProductionDeclaration_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generatorProductionDeclaration_0", pos_)) break;
    }
    return true;
  }

  // (annotation)
  private static boolean generatorProductionDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (localAttributeDefinition)*
  private static boolean generatorProductionDeclaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_6")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!generatorProductionDeclaration_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generatorProductionDeclaration_6", pos_)) break;
    }
    return true;
  }

  // (localAttributeDefinition)
  private static boolean generatorProductionDeclaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = localAttributeDefinition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attributeEvaluationRule)*
  private static boolean generatorProductionDeclaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!generatorProductionDeclaration_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "generatorProductionDeclaration_7", pos_)) break;
    }
    return true;
  }

  // (attributeEvaluationRule)
  private static boolean generatorProductionDeclaration_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorProductionDeclaration_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeEvaluationRule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '$'
  public static boolean generatorValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generatorValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERATOR_VALUE, "<generator value>");
    result_ = consumeToken(builder_, "$");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // useStatement * classDeclaration *
  static boolean languageSpecification(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "languageSpecification")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = languageSpecification_0(builder_, level_ + 1);
    result_ = result_ && languageSpecification_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // useStatement *
  private static boolean languageSpecification_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "languageSpecification_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!useStatement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "languageSpecification_0", pos_)) break;
    }
    return true;
  }

  // classDeclaration *
  private static boolean languageSpecification_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "languageSpecification_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!classDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "languageSpecification_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (annotation)* class ident '(' string ')' ';'
  public static boolean literalClassDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literalClassDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL_CLASS_DECLARATION, "<literal class declaration>");
    result_ = literalClassDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, CLASS, IDENT, LB, STRING, RB);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (annotation)*
  private static boolean literalClassDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literalClassDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!literalClassDeclaration_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "literalClassDeclaration_0", pos_)) break;
    }
    return true;
  }

  // (annotation)
  private static boolean literalClassDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literalClassDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '.' ident
  public static boolean localAttributeAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "localAttributeAccess")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LOCAL_ATTRIBUTE_ACCESS, "<local attribute access>");
    result_ = consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, IDENT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // loc ident '=' attributeExpression ';'
  public static boolean localAttributeDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "localAttributeDefinition")) return false;
    if (!nextTokenIs(builder_, LOC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LOC, IDENT);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && attributeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, LOCAL_ATTRIBUTE_DEFINITION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (annotation)* class ident '{' (attributeDeclaration)* (productionDeclaration)* '}'
  public static boolean productionClassDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRODUCTION_CLASS_DECLARATION, "<production class declaration>");
    result_ = productionClassDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, CLASS, IDENT, LCURLY);
    result_ = result_ && productionClassDeclaration_4(builder_, level_ + 1);
    result_ = result_ && productionClassDeclaration_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (annotation)*
  private static boolean productionClassDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!productionClassDeclaration_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "productionClassDeclaration_0", pos_)) break;
    }
    return true;
  }

  // (annotation)
  private static boolean productionClassDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attributeDeclaration)*
  private static boolean productionClassDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!productionClassDeclaration_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "productionClassDeclaration_4", pos_)) break;
    }
    return true;
  }

  // (attributeDeclaration)
  private static boolean productionClassDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (productionDeclaration)*
  private static boolean productionClassDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!productionClassDeclaration_5_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "productionClassDeclaration_5", pos_)) break;
    }
    return true;
  }

  // (productionDeclaration)
  private static boolean productionClassDeclaration_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionClassDeclaration_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = productionDeclaration(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // treeProductionDeclaration
  //     | generatorProductionDeclaration
  public static boolean productionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "productionDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRODUCTION_DECLARATION, "<production declaration>");
    result_ = treeProductionDeclaration(builder_, level_ + 1);
    if (!result_) result_ = generatorProductionDeclaration(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // string
  public static boolean serialization(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "serialization")) return false;
    if (!nextTokenIs(builder_, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, marker_, SERIALIZATION, result_);
    return result_;
  }

  /* ********************************************************** */
  // (annotation)* ident '(' serialization ')' '{' (localAttributeDefinition)* (attributeEvaluationRule)* '}'
  public static boolean treeProductionDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TREE_PRODUCTION_DECLARATION, "<tree production declaration>");
    result_ = treeProductionDeclaration_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, IDENT, LB);
    result_ = result_ && serialization(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RB, LCURLY);
    result_ = result_ && treeProductionDeclaration_6(builder_, level_ + 1);
    result_ = result_ && treeProductionDeclaration_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (annotation)*
  private static boolean treeProductionDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!treeProductionDeclaration_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "treeProductionDeclaration_0", pos_)) break;
    }
    return true;
  }

  // (annotation)
  private static boolean treeProductionDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (localAttributeDefinition)*
  private static boolean treeProductionDeclaration_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_6")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!treeProductionDeclaration_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "treeProductionDeclaration_6", pos_)) break;
    }
    return true;
  }

  // (localAttributeDefinition)
  private static boolean treeProductionDeclaration_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = localAttributeDefinition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (attributeEvaluationRule)*
  private static boolean treeProductionDeclaration_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!treeProductionDeclaration_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "treeProductionDeclaration_7", pos_)) break;
    }
    return true;
  }

  // (attributeEvaluationRule)
  private static boolean treeProductionDeclaration_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "treeProductionDeclaration_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = attributeEvaluationRule(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // use ident ';'
  public static boolean useStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "useStatement")) return false;
    if (!nextTokenIs(builder_, USE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, USE, IDENT);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, USE_STATEMENT, result_);
    return result_;
  }

}
