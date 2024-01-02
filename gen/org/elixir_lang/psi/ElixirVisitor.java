// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import org.elixir_lang.psi.stub.UnmatchedQualifiedNoParenthesesCall;
import org.elixir_lang.psi.call.Call;
import org.elixir_lang.psi.operation.In;
import org.elixir_lang.psi.call.Named;
import org.elixir_lang.psi.operation.Ternary;
import org.elixir_lang.psi.operation.Addition;
import org.elixir_lang.psi.operation.InMatch;
import org.elixir_lang.psi.stub.UnmatchedUnqualifiedNoArgumentsCall;
import org.elixir_lang.psi.stub.UnmatchedUnqualifiedParenthesesCall;
import org.elixir_lang.psi.operation.And;
import org.elixir_lang.psi.operation.When;
import org.elixir_lang.psi.stub.MatchedQualifiedNoArgumentsCall;
import org.elixir_lang.psi.operation.Match;
import org.elixir_lang.psi.operation.Infix;
import org.elixir_lang.psi.operation.Arrow;
import org.elixir_lang.psi.operation.Pipe;
import org.elixir_lang.psi.stub.MatchedDotCall;
import org.elixir_lang.psi.stub.UnmatchedUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.stub.MatchedQualifiedParenthesesCall;
import org.elixir_lang.psi.operation.Or;
import org.elixir_lang.psi.stub.MatchedQualifiedNoParenthesesCall;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiNamedElement;
import org.elixir_lang.psi.stub.MatchedUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.operation.Power;
import org.elixir_lang.psi.stub.UnmatchedDotCall;
import org.elixir_lang.psi.operation.NotIn;
import org.elixir_lang.psi.operation.capture.NonNumeric;
import org.elixir_lang.psi.operation.Three;
import org.elixir_lang.psi.stub.MatchedAtUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.operation.Type;
import org.elixir_lang.psi.operation.Two;
import org.elixir_lang.psi.operation.Multiplication;
import org.elixir_lang.psi.stub.UnmatchedQualifiedNoArgumentsCall;
import org.elixir_lang.psi.stub.MatchedUnqualifiedNoArgumentsCall;
import org.elixir_lang.psi.operation.Prefix;
import org.elixir_lang.psi.call.StubBased;
import org.elixir_lang.psi.stub.UnqualifiedNoParenthesesManyArgumentsCall;
import org.elixir_lang.psi.call.arguments.star.NoParentheses;
import org.elixir_lang.psi.qualification.Unqualified;
import org.elixir_lang.psi.stub.MatchedUnqualifiedParenthesesCall;
import org.elixir_lang.psi.stub.UnmatchedQualifiedParenthesesCall;

public class ElixirVisitor extends PsiElementVisitor {

  public void visitAccessExpression(@NotNull ElixirAccessExpression o) {
    visitMaybeModuleName(o);
    // visitQuotable(o);
  }

  public void visitAdditionInfixOperator(@NotNull ElixirAdditionInfixOperator o) {
    visitOperator(o);
  }

  public void visitAlias(@NotNull ElixirAlias o) {
    visitNamedElement(o);
    // visitQualifiableAlias(o);
    // visitQuotable(o);
  }

  public void visitAndInfixOperator(@NotNull ElixirAndInfixOperator o) {
    visitOperator(o);
  }

  public void visitAnonymousFunction(@NotNull ElixirAnonymousFunction o) {
    visitNavigatablePsiElement(o);
    // visitQuotable(o);
  }

  public void visitArrowInfixOperator(@NotNull ElixirArrowInfixOperator o) {
    visitOperator(o);
  }

  public void visitAssociations(@NotNull ElixirAssociations o) {
    visitQuotable(o);
  }

  public void visitAssociationsBase(@NotNull ElixirAssociationsBase o) {
    visitQuotable(o);
  }

  public void visitAtIdentifier(@NotNull ElixirAtIdentifier o) {
    visitPsiElement(o);
  }

  public void visitAtPrefixOperator(@NotNull ElixirAtPrefixOperator o) {
    visitOperator(o);
  }

  public void visitAtom(@NotNull ElixirAtom o) {
    visitNavigatablePsiElement(o);
    // visitPsiNamedElement(o);
    // visitQuotable(o);
  }

  public void visitAtomKeyword(@NotNull ElixirAtomKeyword o) {
    visitQuotable(o);
  }

  public void visitBinaryDigits(@NotNull ElixirBinaryDigits o) {
    visitDigits(o);
  }

  public void visitBinaryWholeNumber(@NotNull ElixirBinaryWholeNumber o) {
    visitWholeNumber(o);
  }

  public void visitBitString(@NotNull ElixirBitString o) {
    visitQuotable(o);
  }

  public void visitBlockIdentifier(@NotNull ElixirBlockIdentifier o) {
    visitQuotable(o);
  }

  public void visitBlockItem(@NotNull ElixirBlockItem o) {
    visitQuotable(o);
  }

  public void visitBlockList(@NotNull ElixirBlockList o) {
    visitQuotableArguments(o);
  }

  public void visitBracketArguments(@NotNull ElixirBracketArguments o) {
    visitQuotable(o);
  }

  public void visitCaptureNumericOperation(@NotNull ElixirCaptureNumericOperation o) {
    visitNamed(o);
    // visitPrefix(o);
  }

  public void visitCapturePrefixOperator(@NotNull ElixirCapturePrefixOperator o) {
    visitOperator(o);
  }

  public void visitCharToken(@NotNull ElixirCharToken o) {
    visitQuotable(o);
  }

  public void visitComparisonInfixOperator(@NotNull ElixirComparisonInfixOperator o) {
    visitOperator(o);
  }

  public void visitContainerAssociationOperation(@NotNull ElixirContainerAssociationOperation o) {
    visitAssociationOperation(o);
  }

  public void visitDecimalDigits(@NotNull ElixirDecimalDigits o) {
    visitDigits(o);
  }

  public void visitDecimalFloat(@NotNull ElixirDecimalFloat o) {
    visitQuotable(o);
  }

  public void visitDecimalFloatExponent(@NotNull ElixirDecimalFloatExponent o) {
    visitPsiElement(o);
  }

  public void visitDecimalFloatExponentSign(@NotNull ElixirDecimalFloatExponentSign o) {
    visitPsiElement(o);
  }

  public void visitDecimalFloatFractional(@NotNull ElixirDecimalFloatFractional o) {
    visitPsiElement(o);
  }

  public void visitDecimalFloatIntegral(@NotNull ElixirDecimalFloatIntegral o) {
    visitPsiElement(o);
  }

  public void visitDecimalWholeNumber(@NotNull ElixirDecimalWholeNumber o) {
    visitWholeNumber(o);
  }

  public void visitDoBlock(@NotNull ElixirDoBlock o) {
    visitQuotableArguments(o);
  }

  public void visitDotInfixOperator(@NotNull ElixirDotInfixOperator o) {
    visitOperator(o);
  }

  public void visitEex(@NotNull ElixirEex o) {
    visitPsiElement(o);
  }

  public void visitEexComment(@NotNull ElixirEexComment o) {
    visitPsiElement(o);
  }

  public void visitEexTag(@NotNull ElixirEexTag o) {
    visitPsiElement(o);
  }

  public void visitEmptyParentheses(@NotNull ElixirEmptyParentheses o) {
    visitQuotable(o);
  }

  public void visitEnclosedHexadecimalEscapeSequence(@NotNull ElixirEnclosedHexadecimalEscapeSequence o) {
    visitEscapedHexadecimalDigits(o);
  }

  public void visitEndOfExpression(@NotNull ElixirEndOfExpression o) {
    visitUnquoted(o);
  }

  public void visitEscapedCharacter(@NotNull ElixirEscapedCharacter o) {
    visitEscapeSequence(o);
  }

  public void visitEscapedEOL(@NotNull ElixirEscapedEOL o) {
    visitEscapeSequence(o);
  }

  public void visitEscapedHeredocTerminator(@NotNull ElixirEscapedHeredocTerminator o) {
    visitPsiElement(o);
  }

  public void visitEscapedLineTerminator(@NotNull ElixirEscapedLineTerminator o) {
    visitPsiElement(o);
  }

  public void visitHeredoc(@NotNull ElixirHeredoc o) {
    visitQuote(o);
  }

  public void visitQuote(@NotNull Quote quote) {
    visitElement(quote);
  }

  public void visitHeredocLine(@NotNull ElixirHeredocLine o) {
    visitHeredocLine((HeredocLine) o);
  }

  public void visitHeredocLine(@NotNull HeredocLine o) {
    visitElement(o);
  }

  public void visitHeredocLineBody(@NotNull ElixirHeredocLineBody o) {
    visitBody(o);
  }

  public void visitHeredocLinePrefix(@NotNull ElixirHeredocLinePrefix o) {
    visitPsiElement(o);
  }

  public void visitHeredocPrefix(@NotNull ElixirHeredocPrefix o) {
    visitPsiElement(o);
  }

  public void visitHexadecimalDigits(@NotNull ElixirHexadecimalDigits o) {
    visitDigits(o);
  }

  public void visitHexadecimalEscapePrefix(@NotNull ElixirHexadecimalEscapePrefix o) {
    visitPsiElement(o);
  }

  public void visitHexadecimalWholeNumber(@NotNull ElixirHexadecimalWholeNumber o) {
    visitWholeNumber(o);
  }

  public void visitIdentifier(@NotNull ElixirIdentifier o) {
    visitQuotable(o);
  }

  public void visitInInfixOperator(@NotNull ElixirInInfixOperator o) {
    visitOperator(o);
  }

  public void visitInMatchInfixOperator(@NotNull ElixirInMatchInfixOperator o) {
    visitOperator(o);
  }

  public void visitInterpolatedHeredocLine(@NotNull ElixirInterpolatedHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitInterpolatedHeredocLineBody(@NotNull ElixirInterpolatedHeredocLineBody o) {
    visitBody(o);
  }

  public void visitInterpolatedSigilHeredoc(@NotNull ElixirInterpolatedSigilHeredoc o) {
    visitSigil(o);
  }

  public void visitInterpolatedSigilLine(@NotNull ElixirInterpolatedSigilLine o) {
    visitSigil(o);
  }

  public void visitSigil(@NotNull Sigil sigil) {
    visitElement(sigil);
  }

  public void visitInterpolatedSigilLineBody(@NotNull ElixirInterpolatedSigilLineBody o) {
    visitBody(o);
  }

  public void visitInterpolation(@NotNull ElixirInterpolation o) {
    visitPsiElement(o);
  }

  public void visitKeywordKey(@NotNull ElixirKeywordKey o) {
    visitNamedElement(o);
    // visitQuotable(o);
  }

  public void visitKeywordPair(@NotNull ElixirKeywordPair o) {
    visitQuotableKeywordPair(o);
  }

  public void visitKeywords(@NotNull ElixirKeywords o) {
    visitQuotableKeywordList(o);
  }

  public void visitLine(@NotNull ElixirLine o) {
    visitQuote(o);
  }

  public void visitLineBody(@NotNull ElixirLineBody o) {
    visitBody(o);
  }

  public void visitList(@NotNull ElixirList o) {
    visitQuotable(o);
  }

  public void visitLiteralHeredocLine(@NotNull ElixirLiteralHeredocLine o) {
    visitHeredocLine(o);
  }

  public void visitLiteralHeredocLineBody(@NotNull ElixirLiteralHeredocLineBody o) {
    visitBody(o);
  }

  public void visitLiteralSigilHeredoc(@NotNull ElixirLiteralSigilHeredoc o) {
    visitSigil(o);
  }

  public void visitLiteralSigilLine(@NotNull ElixirLiteralSigilLine o) {
    visitSigil(o);
  }

  public void visitLiteralSigilLineBody(@NotNull ElixirLiteralSigilLineBody o) {
    visitBody(o);
  }

  public void visitMapArguments(@NotNull ElixirMapArguments o) {
    visitQuotable(o);
  }

  public void visitMapConstructionArguments(@NotNull ElixirMapConstructionArguments o) {
    visitQuotableArguments(o);
  }

  public void visitMapOperation(@NotNull ElixirMapOperation o) {
    visitQuotable(o);
  }

  public void visitMapPrefixOperator(@NotNull ElixirMapPrefixOperator o) {
    visitOperator(o);
  }

  public void visitMapUpdateArguments(@NotNull ElixirMapUpdateArguments o) {
    visitQuotable(o);
  }

  public void visitMatchInfixOperator(@NotNull ElixirMatchInfixOperator o) {
    visitOperator(o);
  }

  public void visitMatchedAdditionOperation(@NotNull ElixirMatchedAdditionOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitAddition(o);
  }

  public void visitMatchedAndOperation(@NotNull ElixirMatchedAndOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitAnd(o);
  }

  public void visitMatchedArrowOperation(@NotNull ElixirMatchedArrowOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitArrow(o);
  }

  public void visitMatchedAtNumericBracketOperation(@NotNull ElixirMatchedAtNumericBracketOperation o) {
    visitMatchedExpression(o);
    // visitAtNumericBracketOperation(o);
  }

  public void visitMatchedAtOperation(@NotNull ElixirMatchedAtOperation o) {
    visitAtOperation(o);
  }

  public void visitAtOperation(@NotNull AtOperation o) {
    visitElement(o);
  }

  public void visitMatchedAtUnqualifiedBracketOperation(@NotNull ElixirMatchedAtUnqualifiedBracketOperation o) {
    visitMatchedExpression(o);
    // visitAtUnqualifiedBracketOperation(o);
  }

  public void visitMatchedAtUnqualifiedNoParenthesesCall(@NotNull ElixirMatchedAtUnqualifiedNoParenthesesCall o) {
    visitMatchedExpression(o);
    // visitAtUnqualifiedNoParenthesesCall(o);
    // visitMatchedCall(o);
  }

  public void visitMatchedBracketOperation(@NotNull ElixirMatchedBracketOperation o) {
    visitMatchedExpression(o);
    // visitBracketOperation(o);
  }

  public void visitMatchedCaptureNonNumericOperation(@NotNull ElixirMatchedCaptureNonNumericOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitNonNumeric(o);
  }

  public void visitMatchedComparisonOperation(@NotNull ElixirMatchedComparisonOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitInfix(o);
  }

  public void visitMatchedDotCall(@NotNull ElixirMatchedDotCall o) {
    visitMatchedExpression(o);
    // visitDotCall(o);
    // visitMatchedCall(o);
  }

  public void visitMatchedExpression(@NotNull ElixirMatchedExpression o) {
    visitPsiElement(o);
  }

  public void visitMatchedInMatchOperation(@NotNull ElixirMatchedInMatchOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitInMatch(o);
  }

  public void visitMatchedInOperation(@NotNull ElixirMatchedInOperation o) {
    visitMatchedExpression(o);
    // visitCall(o);
    // visitIn(o);
  }

  public void visitMatchedMatchOperation(@NotNull ElixirMatchedMatchOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitMatch(o);
  }

  public void visitMatchedMultiplicationOperation(@NotNull ElixirMatchedMultiplicationOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitMultiplication(o);
  }

  public void visitMatchedNotInOperation(@NotNull ElixirMatchedNotInOperation o) {
    visitMatchedExpression(o);
    // visitCall(o);
    // visitNotIn(o);
  }

  public void visitMatchedOrOperation(@NotNull ElixirMatchedOrOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitOr(o);
  }

  public void visitMatchedParenthesesArguments(@NotNull ElixirMatchedParenthesesArguments o) {
    visitPsiElement(o);
  }

  public void visitMatchedPipeOperation(@NotNull ElixirMatchedPipeOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitPipe(o);
  }

  public void visitMatchedPowerOperation(@NotNull ElixirMatchedPowerOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitPower(o);
  }

  public void visitMatchedQualifiedAlias(@NotNull ElixirMatchedQualifiedAlias o) {
    visitMatchedExpression(o);
    // visitNamedElement(o);
    // visitQualifiedAlias(o);
  }

  public void visitMatchedQualifiedBracketOperation(@NotNull ElixirMatchedQualifiedBracketOperation o) {
    visitMatchedExpression(o);
    // visitQualifiedBracketOperation(o);
  }

  public void visitMatchedQualifiedMultipleAliases(@NotNull ElixirMatchedQualifiedMultipleAliases o) {
    visitMatchedExpression(o);
    // visitQualifiedMultipleAliases(o);
  }

  public void visitMatchedQualifiedNoArgumentsCall(@NotNull ElixirMatchedQualifiedNoArgumentsCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitQualifiedNoArgumentsCall(o);
  }

  public void visitMatchedQualifiedNoParenthesesCall(@NotNull ElixirMatchedQualifiedNoParenthesesCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitQualifiedNoParenthesesCall(o);
  }

  public void visitMatchedQualifiedParenthesesCall(@NotNull ElixirMatchedQualifiedParenthesesCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitQualifiedParenthesesCall(o);
  }

  public void visitMatchedRelationalOperation(@NotNull ElixirMatchedRelationalOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitInfix(o);
  }

  public void visitMatchedTernaryOperation(@NotNull ElixirMatchedTernaryOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitTernary(o);
  }

  public void visitMatchedThreeOperation(@NotNull ElixirMatchedThreeOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitThree(o);
  }

  public void visitMatchedTwoOperation(@NotNull ElixirMatchedTwoOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitTwo(o);
  }

  public void visitMatchedTypeOperation(@NotNull ElixirMatchedTypeOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitType(o);
  }

  public void visitMatchedUnaryOperation(@NotNull ElixirMatchedUnaryOperation o) {
    visitMatchedExpression(o);
    // visitUnaryOperation(o);
  }

  public void visitMatchedUnqualifiedBracketOperation(@NotNull ElixirMatchedUnqualifiedBracketOperation o) {
    visitMatchedExpression(o);
    // visitUnqualifiedBracketOperation(o);
  }

  public void visitMatchedUnqualifiedNoArgumentsCall(@NotNull ElixirMatchedUnqualifiedNoArgumentsCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitUnqualifiedNoArgumentsCall(o);
  }

  public void visitMatchedUnqualifiedNoParenthesesCall(@NotNull ElixirMatchedUnqualifiedNoParenthesesCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitUnqualifiedNoParenthesesCall(o);
  }

  public void visitMatchedUnqualifiedParenthesesCall(@NotNull ElixirMatchedUnqualifiedParenthesesCall o) {
    visitMatchedExpression(o);
    // visitMatchedCall(o);
    // visitUnqualifiedParenthesesCall(o);
  }

  public void visitMatchedWhenOperation(@NotNull ElixirMatchedWhenOperation o) {
    visitMatchedExpression(o);
    // visitNamed(o);
    // visitWhen(o);
  }

  public void visitMultipleAliases(@NotNull ElixirMultipleAliases o) {
    visitQuotable(o);
  }

  public void visitMultiplicationInfixOperator(@NotNull ElixirMultiplicationInfixOperator o) {
    visitOperator(o);
  }

  public void visitNoParenthesesArguments(@NotNull ElixirNoParenthesesArguments o) {
    visitQuotableArguments(o);
  }

  public void visitNoParenthesesKeywordPair(@NotNull ElixirNoParenthesesKeywordPair o) {
    visitQuotableKeywordPair(o);
  }

  public void visitNoParenthesesKeywords(@NotNull ElixirNoParenthesesKeywords o) {
    visitQuotableKeywordList(o);
  }

  public void visitNoParenthesesManyStrictNoParenthesesExpression(@NotNull ElixirNoParenthesesManyStrictNoParenthesesExpression o) {
    visitQuotable(o);
  }

  public void visitNoParenthesesOneArgument(@NotNull ElixirNoParenthesesOneArgument o) {
    visitArguments(o);
    // visitMaybeModuleName(o);
    // visitQuotableArguments(o);
  }

  public void visitNoParenthesesStrict(@NotNull ElixirNoParenthesesStrict o) {
    visitArguments(o);
    // visitQuotableArguments(o);
  }

  public void visitNotInfixOperator(@NotNull ElixirNotInfixOperator o) {
    visitOperator(o);
  }

  public void visitOctalDigits(@NotNull ElixirOctalDigits o) {
    visitDigits(o);
  }

  public void visitOctalWholeNumber(@NotNull ElixirOctalWholeNumber o) {
    visitWholeNumber(o);
  }

  public void visitOpenHexadecimalEscapeSequence(@NotNull ElixirOpenHexadecimalEscapeSequence o) {
    visitEscapedHexadecimalDigits(o);
  }

  public void visitOrInfixOperator(@NotNull ElixirOrInfixOperator o) {
    visitOperator(o);
  }

  public void visitParenthesesArguments(@NotNull ElixirParenthesesArguments o) {
    visitArguments(o);
    // visitQuotableArguments(o);
  }

  public void visitParentheticalStab(@NotNull ElixirParentheticalStab o) {
    visitQuotable(o);
  }

  public void visitPipeInfixOperator(@NotNull ElixirPipeInfixOperator o) {
    visitOperator(o);
  }

  public void visitPowerInfixOperator(@NotNull ElixirPowerInfixOperator o) {
    visitOperator(o);
  }

  public void visitQuoteHexadecimalEscapeSequence(@NotNull ElixirQuoteHexadecimalEscapeSequence o) {
    visitEscapeSequence(o);
  }

  public void visitRelationalInfixOperator(@NotNull ElixirRelationalInfixOperator o) {
    visitOperator(o);
  }

  public void visitRelativeIdentifier(@NotNull ElixirRelativeIdentifier o) {
    visitQuotable(o);
  }

  public void visitSigilHexadecimalEscapeSequence(@NotNull ElixirSigilHexadecimalEscapeSequence o) {
    visitEscapeSequence(o);
  }

  public void visitSigilModifiers(@NotNull ElixirSigilModifiers o) {
    visitQuotable(o);
  }

  public void visitStab(@NotNull ElixirStab o) {
    visitQuotable(o);
  }

  public void visitStabBody(@NotNull ElixirStabBody o) {
    visitQuotable(o);
  }

  public void visitStabInfixOperator(@NotNull ElixirStabInfixOperator o) {
    visitOperator(o);
  }

  public void visitStabNoParenthesesSignature(@NotNull ElixirStabNoParenthesesSignature o) {
    visitQuotable(o);
  }

  public void visitStabOperation(@NotNull ElixirStabOperation o) {
    visitQuotable(o);
  }

  public void visitStabParenthesesSignature(@NotNull ElixirStabParenthesesSignature o) {
    visitQuotable(o);
    // visitWhen(o);
  }

  public void visitStructOperation(@NotNull ElixirStructOperation o) {
    visitQuotable(o);
  }

  public void visitTernaryInfixOperator(@NotNull ElixirTernaryInfixOperator o) {
    visitOperator(o);
  }

  public void visitThreeInfixOperator(@NotNull ElixirThreeInfixOperator o) {
    visitOperator(o);
  }

  public void visitTuple(@NotNull ElixirTuple o) {
    visitQuotable(o);
  }

  public void visitTwoInfixOperator(@NotNull ElixirTwoInfixOperator o) {
    visitOperator(o);
  }

  public void visitTypeInfixOperator(@NotNull ElixirTypeInfixOperator o) {
    visitOperator(o);
  }

  public void visitUnaryPrefixOperator(@NotNull ElixirUnaryPrefixOperator o) {
    visitOperator(o);
  }

  public void visitUnknownBaseDigits(@NotNull ElixirUnknownBaseDigits o) {
    visitDigits(o);
  }

  public void visitUnknownBaseWholeNumber(@NotNull ElixirUnknownBaseWholeNumber o) {
    visitWholeNumber(o);
  }

  public void visitUnmatchedAdditionOperation(@NotNull ElixirUnmatchedAdditionOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitAddition(o);
  }

  public void visitUnmatchedAndOperation(@NotNull ElixirUnmatchedAndOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitAnd(o);
  }

  public void visitUnmatchedArrowOperation(@NotNull ElixirUnmatchedArrowOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitArrow(o);
  }

  public void visitUnmatchedAtNumericBracketOperation(@NotNull ElixirUnmatchedAtNumericBracketOperation o) {
    visitUnmatchedExpression(o);
    // visitAtNumericBracketOperation(o);
  }

  public void visitUnmatchedAtOperation(@NotNull ElixirUnmatchedAtOperation o) {
    visitAtOperation(o);
  }

  public void visitUnmatchedAtUnqualifiedBracketOperation(@NotNull ElixirUnmatchedAtUnqualifiedBracketOperation o) {
    visitUnmatchedExpression(o);
    // visitAtUnqualifiedBracketOperation(o);
  }

  public void visitUnmatchedAtUnqualifiedNoParenthesesCall(@NotNull ElixirUnmatchedAtUnqualifiedNoParenthesesCall o) {
    visitUnmatchedExpression(o);
    // visitAtUnqualifiedNoParenthesesCall(o);
  }

  public void visitUnmatchedBracketOperation(@NotNull ElixirUnmatchedBracketOperation o) {
    visitUnmatchedExpression(o);
    // visitBracketOperation(o);
  }

  public void visitUnmatchedCaptureNonNumericOperation(@NotNull ElixirUnmatchedCaptureNonNumericOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitNonNumeric(o);
  }

  public void visitUnmatchedComparisonOperation(@NotNull ElixirUnmatchedComparisonOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitInfix(o);
  }

  public void visitUnmatchedDotCall(@NotNull ElixirUnmatchedDotCall o) {
    visitUnmatchedExpression(o);
    // visitDotCall(o);
  }

  public void visitUnmatchedExpression(@NotNull ElixirUnmatchedExpression o) {
    visitPsiElement(o);
  }

  public void visitUnmatchedInMatchOperation(@NotNull ElixirUnmatchedInMatchOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitInMatch(o);
  }

  public void visitUnmatchedInOperation(@NotNull ElixirUnmatchedInOperation o) {
    visitUnmatchedExpression(o);
    // visitCall(o);
    // visitIn(o);
  }

  public void visitUnmatchedMatchOperation(@NotNull ElixirUnmatchedMatchOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitMatch(o);
  }

  public void visitUnmatchedMultiplicationOperation(@NotNull ElixirUnmatchedMultiplicationOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitMultiplication(o);
  }

  public void visitUnmatchedNotInOperation(@NotNull ElixirUnmatchedNotInOperation o) {
    visitUnmatchedExpression(o);
    // visitCall(o);
    // visitNotIn(o);
  }

  public void visitUnmatchedOrOperation(@NotNull ElixirUnmatchedOrOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitOr(o);
  }

  public void visitUnmatchedPipeOperation(@NotNull ElixirUnmatchedPipeOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitPipe(o);
  }

  public void visitUnmatchedPowerOperation(@NotNull ElixirUnmatchedPowerOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitPower(o);
  }

  public void visitUnmatchedQualifiedAlias(@NotNull ElixirUnmatchedQualifiedAlias o) {
    visitUnmatchedExpression(o);
    // visitQualifiedAlias(o);
  }

  public void visitUnmatchedQualifiedBracketOperation(@NotNull ElixirUnmatchedQualifiedBracketOperation o) {
    visitUnmatchedExpression(o);
    // visitQualifiedBracketOperation(o);
  }

  public void visitUnmatchedQualifiedMultipleAliases(@NotNull ElixirUnmatchedQualifiedMultipleAliases o) {
    visitUnmatchedExpression(o);
    // visitQualifiedMultipleAliases(o);
  }

  public void visitUnmatchedQualifiedNoArgumentsCall(@NotNull ElixirUnmatchedQualifiedNoArgumentsCall o) {
    visitUnmatchedExpression(o);
    // visitQualifiedNoArgumentsCall(o);
  }

  public void visitUnmatchedQualifiedNoParenthesesCall(@NotNull ElixirUnmatchedQualifiedNoParenthesesCall o) {
    visitUnmatchedExpression(o);
    // visitQualifiedNoParenthesesCall(o);
  }

  public void visitUnmatchedQualifiedParenthesesCall(@NotNull ElixirUnmatchedQualifiedParenthesesCall o) {
    visitUnmatchedExpression(o);
    // visitQualifiedParenthesesCall(o);
  }

  public void visitUnmatchedRelationalOperation(@NotNull ElixirUnmatchedRelationalOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitInfix(o);
  }

  public void visitUnmatchedTernaryOperation(@NotNull ElixirUnmatchedTernaryOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitTernary(o);
  }

  public void visitUnmatchedThreeOperation(@NotNull ElixirUnmatchedThreeOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitThree(o);
  }

  public void visitUnmatchedTwoOperation(@NotNull ElixirUnmatchedTwoOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitTwo(o);
  }

  public void visitUnmatchedTypeOperation(@NotNull ElixirUnmatchedTypeOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitType(o);
  }

  public void visitUnmatchedUnaryOperation(@NotNull ElixirUnmatchedUnaryOperation o) {
    visitUnmatchedExpression(o);
    // visitUnaryOperation(o);
  }

  public void visitUnmatchedUnqualifiedBracketOperation(@NotNull ElixirUnmatchedUnqualifiedBracketOperation o) {
    visitUnmatchedExpression(o);
    // visitUnqualifiedBracketOperation(o);
  }

  public void visitUnmatchedUnqualifiedNoArgumentsCall(@NotNull ElixirUnmatchedUnqualifiedNoArgumentsCall o) {
    visitUnmatchedExpression(o);
    // visitUnqualifiedNoArgumentsCall(o);
  }

  public void visitUnmatchedUnqualifiedNoParenthesesCall(@NotNull ElixirUnmatchedUnqualifiedNoParenthesesCall o) {
    visitUnmatchedExpression(o);
    // visitUnqualifiedNoParenthesesCall(o);
  }

  public void visitUnmatchedUnqualifiedParenthesesCall(@NotNull ElixirUnmatchedUnqualifiedParenthesesCall o) {
    visitUnmatchedExpression(o);
    // visitUnqualifiedParenthesesCall(o);
  }

  public void visitUnmatchedWhenOperation(@NotNull ElixirUnmatchedWhenOperation o) {
    visitUnmatchedExpression(o);
    // visitNamed(o);
    // visitWhen(o);
  }

  public void visitUnqualifiedNoParenthesesManyArgumentsCall(@NotNull ElixirUnqualifiedNoParenthesesManyArgumentsCall o) {
    visitPsiElement(o);
    // visitStubBased(o);
    // visitNoParentheses(o);
    // visitUnqualified(o);
    // visitQuotable(o);
  }

  public void visitVariable(@NotNull ElixirVariable o) {
    visitNamedElement(o);
    // visitQuotable(o);
  }

  public void visitWhenInfixOperator(@NotNull ElixirWhenInfixOperator o) {
    visitOperator(o);
  }

  public void visitNavigatablePsiElement(@NotNull NavigatablePsiElement o) {
    visitElement(o);
  }

  public void visitArguments(@NotNull Arguments o) {
    visitElement(o);
  }

  public void visitAssociationOperation(@NotNull AssociationOperation o) {
    visitElement(o);
  }

  public void visitAtomable(@NotNull Atomable o) {
    visitElement(o);
  }

  public void visitBody(@NotNull Body o) {
    visitElement(o);
  }

  public void visitDigits(@NotNull Digits o) {
    visitElement(o);
  }

  public void visitEscapeSequence(@NotNull EscapeSequence o) {
    visitElement(o);
  }

  public void visitEscapedHexadecimalDigits(@NotNull EscapedHexadecimalDigits o) {
    visitElement(o);
  }

  public void visitInterpolated(@NotNull Interpolated o) {
    visitElement(o);
  }

  public void visitLiteral(@NotNull Literal o) {
    visitElement(o);
  }

  public void visitMaybeModuleName(@NotNull MaybeModuleName o) {
    visitElement(o);
  }

  public void visitNamedElement(@NotNull NamedElement o) {
    visitElement(o);
  }

  public void visitOperator(@NotNull Operator o) {
    visitElement(o);
  }

  public void visitQuotable(@NotNull Quotable o) {
    visitElement(o);
  }

  public void visitQuotableArguments(@NotNull QuotableArguments o) {
    visitElement(o);
  }

  public void visitQuotableKeywordList(@NotNull QuotableKeywordList o) {
    visitElement(o);
  }

  public void visitQuotableKeywordPair(@NotNull QuotableKeywordPair o) {
    visitElement(o);
  }

  public void visitSigilHeredoc(@NotNull SigilHeredoc o) {
    visitElement(o);
  }

  public void visitUnquoted(@NotNull Unquoted o) {
    visitElement(o);
  }

  public void visitWholeNumber(@NotNull WholeNumber o) {
    visitElement(o);
  }

  public void visitNamed(@NotNull Named o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
