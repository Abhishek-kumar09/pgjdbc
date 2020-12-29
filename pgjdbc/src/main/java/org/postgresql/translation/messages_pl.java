/* Automatically generated by GNU msgfmt.  Do not modify!  */
package org.postgresql.translation;
public class messages_pl extends java.util.ResourceBundle {
  private static final java.lang.String[] table;
  static {
    java.lang.String[] t = new java.lang.String[346];
    t[0] = "";
    t[1] = "Project-Id-Version: head-pl\nReport-Msgid-Bugs-To: \nPO-Revision-Date: 2005-05-22 03:01+0200\nLast-Translator: Jarosław Jan Pyszny <jarek@pyszny.net>\nLanguage-Team:  <pl@li.org>\nLanguage: \nMIME-Version: 1.0\nContent-Type: text/plain; charset=UTF-8\nContent-Transfer-Encoding: 8bit\nX-Generator: KBabel 1.10\nPlural-Forms:  nplurals=3; plural=(n==1 ? 0 : n%10>=2 && n%10<=4 && (n%100<10 || n%100>=20) ? 1 : 2);\n";
    t[2] = "The driver currently does not support COPY operations.";
    t[3] = "Sterownik nie obsługuje aktualnie operacji COPY.";
    t[4] = "Internal Query: {0}";
    t[5] = "Wewnętrzne Zapytanie: {0}";
    t[6] = "There are no rows in this ResultSet.";
    t[7] = "Nie ma żadnych wierszy w tym ResultSet.";
    t[8] = "Invalid character data was found.  This is most likely caused by stored data containing characters that are invalid for the character set the database was created in.  The most common example of this is storing 8bit data in a SQL_ASCII database.";
    t[9] = "Znaleziono nieprawidłowy znak. Najprawdopodobniej jest to spowodowane przechowywaniem w bazie znaków, które nie pasują do zestawu znaków wybranego podczas tworzenia bazy danych. Najczęstszy przykład to przechowywanie 8-bitowych znaków w bazie o kodowaniu SQL_ASCII.";
    t[12] = "Fastpath call {0} - No result was returned and we expected an integer.";
    t[13] = "Wywołanie fastpath {0} - Nie otrzymano żadnego wyniku, a oczekiwano liczby całkowitej.";
    t[14] = "An error occurred while setting up the SSL connection.";
    t[15] = "Wystąpił błąd podczas ustanawiania połączenia SSL.";
    t[20] = "A CallableStatement was declared, but no call to registerOutParameter(1, <some type>) was made.";
    t[21] = "Funkcja CallableStatement została zadeklarowana, ale nie wywołano registerOutParameter (1, <jakiś typ>).";
    t[24] = "Unexpected command status: {0}.";
    t[25] = "Nieoczekiwany status komendy: {0}.";
    t[32] = "A connection could not be made using the requested protocol {0}.";
    t[33] = "Nie można było nawiązać połączenia stosując żądany protokołu {0}.";
    t[38] = "Bad value for type {0} : {1}";
    t[39] = "Zła wartość dla typu {0}: {1}";
    t[40] = "Not on the insert row.";
    t[41] = "Nie na wstawianym rekordzie.";
    t[42] = "Premature end of input stream, expected {0} bytes, but only read {1}.";
    t[43] = "Przedwczesny koniec strumienia wejściowego, oczekiwano {0} bajtów, odczytano tylko {1}.";
    t[48] = "Unknown type {0}.";
    t[49] = "Nieznany typ {0}.";
    t[52] = "The server does not support SSL.";
    t[53] = "Serwer nie obsługuje SSL.";
    t[60] = "Cannot call updateRow() when on the insert row.";
    t[61] = "Nie można wywołać updateRow() na wstawianym rekordzie.";
    t[62] = "Where: {0}";
    t[63] = "Gdzie: {0}";
    t[72] = "Cannot call cancelRowUpdates() when on the insert row.";
    t[73] = "Nie można wywołać cancelRowUpdates() na wstawianym rekordzie.";
    t[82] = "Server SQLState: {0}";
    t[83] = "Serwer SQLState: {0}";
    t[92] = "ResultSet is not updateable.  The query that generated this result set must select only one table, and must select all primary keys from that table. See the JDBC 2.1 API Specification, section 5.6 for more details.";
    t[93] = "ResultSet nie jest modyfikowalny (not updateable). Zapytanie, które zwróciło ten wynik musi dotyczyć tylko jednej tabeli oraz musi pobierać wszystkie klucze główne tej tabeli. Zobacz Specyfikację JDBC 2.1 API, rozdział 5.6, by uzyskać więcej szczegółów.";
    t[102] = "Cannot tell if path is open or closed: {0}.";
    t[103] = "Nie można stwierdzić, czy ścieżka jest otwarta czy zamknięta: {0}.";
    t[108] = "The parameter index is out of range: {0}, number of parameters: {1}.";
    t[109] = "Indeks parametru jest poza zakresem: {0}, liczba parametrów: {1}.";
    t[110] = "Unsupported Types value: {0}";
    t[111] = "Nieznana wartość Types: {0}";
    t[112] = "Currently positioned after the end of the ResultSet.  You cannot call deleteRow() here.";
    t[113] = "Aktualna pozycja za końcem ResultSet. Nie można wywołać deleteRow().";
    t[114] = "This ResultSet is closed.";
    t[115] = "Ten ResultSet jest zamknięty.";
    t[120] = "Conversion of interval failed";
    t[121] = "Konwersja typu interval nie powiodła się";
    t[122] = "Unable to load the class {0} responsible for the datatype {1}";
    t[123] = "Nie jest możliwe załadowanie klasy {0} odpowiedzialnej za typ danych {1}";
    t[138] = "Error loading default settings from driverconfig.properties";
    t[139] = "Błąd podczas wczytywania ustawień domyślnych z driverconfig.properties";
    t[142] = "The array index is out of range: {0}";
    t[143] = "Indeks tablicy jest poza zakresem: {0}";
    t[146] = "Unknown Types value.";
    t[147] = "Nieznana wartość Types.";
    t[154] = "The maximum field size must be a value greater than or equal to 0.";
    t[155] = "Maksymalny rozmiar pola musi być wartością dodatnią lub 0.";
    t[168] = "Detail: {0}";
    t[169] = "Szczegóły: {0}";
    t[170] = "Unknown Response Type {0}.";
    t[171] = "Nieznany typ odpowiedzi {0}.";
    t[172] = "Maximum number of rows must be a value grater than or equal to 0.";
    t[173] = "Maksymalna liczba rekordów musi być wartością dodatnią lub 0.";
    t[184] = "Query timeout must be a value greater than or equals to 0.";
    t[185] = "Timeout zapytania musi być wartością dodatnią lub 0.";
    t[186] = "Too many update results were returned.";
    t[187] = "Zapytanie nie zwróciło żadnych wyników.";
    t[190] = "The connection attempt failed.";
    t[191] = "Próba nawiązania połączenia nie powiodła się.";
    t[198] = "Connection has been closed automatically because a new connection was opened for the same PooledConnection or the PooledConnection has been closed.";
    t[199] = "Połączenie zostało zamknięte automatycznie, ponieważ nowe połączenie zostało otwarte dla tego samego PooledConnection lub PooledConnection zostało zamknięte.";
    t[204] = "Protocol error.  Session setup failed.";
    t[205] = "Błąd protokołu. Nie udało się utworzyć sesji.";
    t[206] = "This PooledConnection has already been closed.";
    t[207] = "To PooledConnection zostało już zamknięte.";
    t[208] = "DataSource has been closed.";
    t[209] = "DataSource zostało zamknięte.";
    t[212] = "Method {0} is not yet implemented.";
    t[213] = "Metoda {0}nie jest jeszcze obsługiwana.";
    t[216] = "Hint: {0}";
    t[217] = "Wskazówka: {0}";
    t[218] = "No value specified for parameter {0}.";
    t[219] = "Nie podano wartości dla parametru {0}.";
    t[222] = "Position: {0}";
    t[223] = "Pozycja: {0}";
    t[226] = "Cannot call deleteRow() when on the insert row.";
    t[227] = "Nie można wywołać deleteRow() na wstawianym rekordzie.";
    t[240] = "Conversion of money failed.";
    t[241] = "Konwersja typu money nie powiodła się.";
    t[244] = "Internal Position: {0}";
    t[245] = "Wewnętrzna Pozycja: {0}";
    t[248] = "Connection has been closed.";
    t[249] = "Połączenie zostało zamknięte.";
    t[254] = "Currently positioned before the start of the ResultSet.  You cannot call deleteRow() here.";
    t[255] = "Aktualna pozycja przed początkiem ResultSet. Nie można wywołać deleteRow().";
    t[258] = "Failed to create object for: {0}.";
    t[259] = "Nie powiodło się utworzenie obiektu dla: {0}.";
    t[262] = "Fetch size must be a value greater to or equal to 0.";
    t[263] = "Rozmiar pobierania musi być wartością dodatnią lub 0.";
    t[270] = "No results were returned by the query.";
    t[271] = "Zapytanie nie zwróciło żadnych wyników.";
    t[276] = "The authentication type {0} is not supported. Check that you have configured the pg_hba.conf file to include the client''s IP address or subnet, and that it is using an authentication scheme supported by the driver.";
    t[277] = "Uwierzytelnienie typu {0} nie jest obsługiwane. Upewnij się, że skonfigurowałeś plik pg_hba.conf tak, że zawiera on adres IP lub podsieć klienta oraz że użyta metoda uwierzytelnienia jest wspierana przez ten sterownik.";
    t[280] = "Conversion to type {0} failed: {1}.";
    t[281] = "Konwersja do typu {0} nie powiodła się: {1}.";
    t[282] = "A result was returned when none was expected.";
    t[283] = "Zwrócono wynik zapytania, choć nie był on oczekiwany.";
    t[292] = "Transaction isolation level {0} not supported.";
    t[293] = "Poziom izolacji transakcji {0} nie jest obsługiwany.";
    t[306] = "ResultSet not positioned properly, perhaps you need to call next.";
    t[307] = "Zła pozycja w ResultSet, może musisz wywołać next.";
    t[308] = "Location: File: {0}, Routine: {1}, Line: {2}";
    t[309] = "Lokalizacja: Plik: {0}, Procedura: {1}, Linia: {2}";
    t[314] = "An unexpected result was returned by a query.";
    t[315] = "Zapytanie zwróciło nieoczekiwany wynik.";
    t[316] = "The column index is out of range: {0}, number of columns: {1}.";
    t[317] = "Indeks kolumny jest poza zakresem: {0}, liczba kolumn: {1}.";
    t[318] = "Expected command status BEGIN, got {0}.";
    t[319] = "Spodziewano się statusu komendy BEGIN, otrzymano {0}.";
    t[320] = "The fastpath function {0} is unknown.";
    t[321] = "Funkcja fastpath {0} jest nieznana.";
    t[324] = "The server requested password-based authentication, but no password was provided.";
    t[325] = "Serwer zażądał uwierzytelnienia opartego na haśle, ale żadne hasło nie zostało dostarczone.";
    t[332] = "The array index is out of range: {0}, number of elements: {1}.";
    t[333] = "Indeks tablicy jest poza zakresem: {0}, liczba elementów: {1}.";
    t[338] = "Something unusual has occurred to cause the driver to fail. Please report this exception.";
    t[339] = "Coś niezwykłego spowodowało pad sterownika. Proszę, zgłoś ten wyjątek.";
    t[342] = "Zero bytes may not occur in string parameters.";
    t[343] = "Zerowe bajty nie mogą pojawiać się w parametrach typu łańcuch znakowy.";
    table = t;
  }
  public java.lang.Object handleGetObject (java.lang.String msgid) throws java.util.MissingResourceException {
    int hash_val = msgid.hashCode() & 0x7fffffff;
    int idx = (hash_val % 173) << 1;
    {
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
    int incr = ((hash_val % 171) + 1) << 1;
    for (;;) {
      idx += incr;
      if (idx >= 346)
        idx -= 346;
      java.lang.Object found = table[idx];
      if (found == null)
        return null;
      if (msgid.equals(found))
        return table[idx + 1];
    }
  }
  public java.util.Enumeration getKeys () {
    return
        new java.util.Enumeration() {
          private int idx = 0;
          { while (idx < 346 && table[idx] == null) idx += 2; }
          public boolean hasMoreElements () {
            return (idx < 346);
          }
          public java.lang.Object nextElement () {
            java.lang.Object key = table[idx];
            do idx += 2; while (idx < 346 && table[idx] == null);
            return key;
          }
        };
  }
  public java.util.ResourceBundle getParent () {
    return parent;
  }
}
