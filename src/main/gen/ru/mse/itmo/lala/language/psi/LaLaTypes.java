// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.mse.itmo.lala.language.psi.impl.*;

public interface LaLaTypes {

  IElementType ANNOTATION = new LaLaElementType("ANNOTATION");
  IElementType ANNOTATION_ARGUMENT = new LaLaElementType("ANNOTATION_ARGUMENT");
  IElementType ATTRIBUTE_ACCESS = new LaLaElementType("ATTRIBUTE_ACCESS");
  IElementType ATTRIBUTE_ATOM = new LaLaElementType("ATTRIBUTE_ATOM");
  IElementType ATTRIBUTE_DECLARATION = new LaLaElementType("ATTRIBUTE_DECLARATION");
  IElementType ATTRIBUTE_EVALUATION_RULE = new LaLaElementType("ATTRIBUTE_EVALUATION_RULE");
  IElementType ATTRIBUTE_EXPRESSION = new LaLaElementType("ATTRIBUTE_EXPRESSION");
  IElementType ATTRIBUTE_FUNCTION = new LaLaElementType("ATTRIBUTE_FUNCTION");
  IElementType ATTRIBUTE_FUNCTION_CALL = new LaLaElementType("ATTRIBUTE_FUNCTION_CALL");
  IElementType ATTRIBUTE_FUNCTION_NAME = new LaLaElementType("ATTRIBUTE_FUNCTION_NAME");
  IElementType ATTRIBUTE_LITERAL = new LaLaElementType("ATTRIBUTE_LITERAL");
  IElementType ATTRIBUTE_MODIFIER = new LaLaElementType("ATTRIBUTE_MODIFIER");
  IElementType ATTRIBUTE_TYPE_NAME = new LaLaElementType("ATTRIBUTE_TYPE_NAME");
  IElementType BOOLEAN_LITERAL = new LaLaElementType("BOOLEAN_LITERAL");
  IElementType CHILD_REFERENCE = new LaLaElementType("CHILD_REFERENCE");
  IElementType CLASS_DECLARATION = new LaLaElementType("CLASS_DECLARATION");
  IElementType EXPRESSION = new LaLaElementType("EXPRESSION");
  IElementType GENERATOR_PRODUCTION_DECLARATION = new LaLaElementType("GENERATOR_PRODUCTION_DECLARATION");
  IElementType GENERATOR_VALUE = new LaLaElementType("GENERATOR_VALUE");
  IElementType LITERAL_CLASS_DECLARATION = new LaLaElementType("LITERAL_CLASS_DECLARATION");
  IElementType LOCAL_ATTRIBUTE_ACCESS = new LaLaElementType("LOCAL_ATTRIBUTE_ACCESS");
  IElementType LOCAL_ATTRIBUTE_DEFINITION = new LaLaElementType("LOCAL_ATTRIBUTE_DEFINITION");
  IElementType PRODUCTION_CLASS_DECLARATION = new LaLaElementType("PRODUCTION_CLASS_DECLARATION");
  IElementType PRODUCTION_DECLARATION = new LaLaElementType("PRODUCTION_DECLARATION");
  IElementType SERIALIZATION = new LaLaElementType("SERIALIZATION");
  IElementType TREE_PRODUCTION_DECLARATION = new LaLaElementType("TREE_PRODUCTION_DECLARATION");
  IElementType USE_STATEMENT = new LaLaElementType("USE_STATEMENT");

  IElementType CHARLITERAL = new LaLaTokenType("charliteral");
  IElementType CLASS = new LaLaTokenType("class");
  IElementType COMMENT = new LaLaTokenType("comment");
  IElementType FALSE = new LaLaTokenType("false");
  IElementType GRD = new LaLaTokenType("GRD");
  IElementType IDENT = new LaLaTokenType("ident");
  IElementType INH = new LaLaTokenType("INH");
  IElementType LB = new LaLaTokenType("(");
  IElementType LCURLY = new LaLaTokenType("{");
  IElementType LOC = new LaLaTokenType("loc");
  IElementType LSQUARE = new LaLaTokenType("[");
  IElementType NIL = new LaLaTokenType("nil");
  IElementType NUMBER = new LaLaTokenType("number");
  IElementType RB = new LaLaTokenType(")");
  IElementType RCURLY = new LaLaTokenType("}");
  IElementType RSQUARE = new LaLaTokenType("]");
  IElementType STRING = new LaLaTokenType("string");
  IElementType SYN = new LaLaTokenType("SYN");
  IElementType TRUE = new LaLaTokenType("true");
  IElementType USE = new LaLaTokenType("use");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATION) {
        return new LaLaAnnotationImpl(node);
      }
      else if (type == ANNOTATION_ARGUMENT) {
        return new LaLaAnnotationArgumentImpl(node);
      }
      else if (type == ATTRIBUTE_ACCESS) {
        return new LaLaAttributeAccessImpl(node);
      }
      else if (type == ATTRIBUTE_ATOM) {
        return new LaLaAttributeAtomImpl(node);
      }
      else if (type == ATTRIBUTE_DECLARATION) {
        return new LaLaAttributeDeclarationImpl(node);
      }
      else if (type == ATTRIBUTE_EVALUATION_RULE) {
        return new LaLaAttributeEvaluationRuleImpl(node);
      }
      else if (type == ATTRIBUTE_EXPRESSION) {
        return new LaLaAttributeExpressionImpl(node);
      }
      else if (type == ATTRIBUTE_FUNCTION) {
        return new LaLaAttributeFunctionImpl(node);
      }
      else if (type == ATTRIBUTE_FUNCTION_CALL) {
        return new LaLaAttributeFunctionCallImpl(node);
      }
      else if (type == ATTRIBUTE_FUNCTION_NAME) {
        return new LaLaAttributeFunctionNameImpl(node);
      }
      else if (type == ATTRIBUTE_LITERAL) {
        return new LaLaAttributeLiteralImpl(node);
      }
      else if (type == ATTRIBUTE_MODIFIER) {
        return new LaLaAttributeModifierImpl(node);
      }
      else if (type == ATTRIBUTE_TYPE_NAME) {
        return new LaLaAttributeTypeNameImpl(node);
      }
      else if (type == BOOLEAN_LITERAL) {
        return new LaLaBooleanLiteralImpl(node);
      }
      else if (type == CHILD_REFERENCE) {
        return new LaLaChildReferenceImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new LaLaClassDeclarationImpl(node);
      }
      else if (type == EXPRESSION) {
        return new LaLaExpressionImpl(node);
      }
      else if (type == GENERATOR_PRODUCTION_DECLARATION) {
        return new LaLaGeneratorProductionDeclarationImpl(node);
      }
      else if (type == GENERATOR_VALUE) {
        return new LaLaGeneratorValueImpl(node);
      }
      else if (type == LITERAL_CLASS_DECLARATION) {
        return new LaLaLiteralClassDeclarationImpl(node);
      }
      else if (type == LOCAL_ATTRIBUTE_ACCESS) {
        return new LaLaLocalAttributeAccessImpl(node);
      }
      else if (type == LOCAL_ATTRIBUTE_DEFINITION) {
        return new LaLaLocalAttributeDefinitionImpl(node);
      }
      else if (type == PRODUCTION_CLASS_DECLARATION) {
        return new LaLaProductionClassDeclarationImpl(node);
      }
      else if (type == PRODUCTION_DECLARATION) {
        return new LaLaProductionDeclarationImpl(node);
      }
      else if (type == SERIALIZATION) {
        return new LaLaSerializationImpl(node);
      }
      else if (type == TREE_PRODUCTION_DECLARATION) {
        return new LaLaTreeProductionDeclarationImpl(node);
      }
      else if (type == USE_STATEMENT) {
        return new LaLaUseStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
