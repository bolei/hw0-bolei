import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;

public class DependencyExample {
  public static void main(String[] args) {
    TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
    System.out.println(tokenizer.tokenize());
  }
}
