package core.snippet;

import core.gen.rpc.Language;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DefaultSnippetCollection extends SnippetCollection {

  @Inject
  public DefaultSnippetCollection(Snippets.Factory snippetsFactory) {
    initialize(snippetsFactory);
  }

  @Override
  public Language language() {
    return Language.LANGUAGE_DEFAULT;
  }

  @Override
  protected Optional<Snippet> bareSnippet(SnippetTrigger trigger) {
    return Optional.of(
      snippets.insert(trigger, (parent, matches) -> "<%expression%>", Map.of(), true)
    );
  }

  @Override
  protected Optional<Snippet> argumentSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> attributeSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> catchSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> classSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> commentSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> constructorSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> decoratorSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> elementSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> elseSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> elseIfSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> emptyTagSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> entrySnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> enumSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> extendsSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> finallySnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> forSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> forEachSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> functionSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> functionInlineSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> ifSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> implementsSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> importSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> interfaceSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> methodSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> modifierSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> parameterSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> printSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> propertySnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> returnTypeSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> returnValueSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> tagSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> trySnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> typeSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> whileSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }

  @Override
  protected Optional<Snippet> withSnippet(SnippetTrigger trigger) {
    return Optional.empty();
  }
}
