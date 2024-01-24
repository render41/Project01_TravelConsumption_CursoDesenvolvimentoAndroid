**Convenções de Códigos (Code Style):** recomendações e estilos de condificações usado nos métodos, variáveis, nomes de classes, organização, nomenclatura de arquivos, comentários e outros recursos.
OBS.: Não é uma obrigação, mas é importante de ser compreendido. Pode variar de linguagem para linguagem; mas algumas equipes de projetos acabam colocando suas próprias convenções de escrita para adaptar com o time.

**Idioma:** Inglês é o padrão para qualquer código que for construir.

**Nomenclaturas:** camelCase e PascalCase
- camelCase: inicial a primeira palavra em minúscula e as próximas são em maiúscula. Muito aplicado a variáveis, funções/métodos, atributos de classes e parâmetros.
- PascalCase: todas as palavras vão começar em maiúsculo. Usado com frequência nas classes, métodos públicos, enums, interfaces e existem outros elementos, mas esses são os mais comuns.
OBS.: Nem todas as linguagens seguém esse padrão, como por exemplo no C# que temos suas funções/métodos em PascalCase. É interessante ver o *Code Style* da linguagem que você está usando.

**Constantes:** palavras reservadas que vão usar o *const* ou dependendo da linguagem, usando o *val* dentro ou fora da classe; devem usar todas as letras maiúsculas (CAIXA_ALTA) e cada uma das palavras separadas com um *underline*.

**Classes:** caso forem poucos parâmetros, colocar eles em uma única linha; se não, separar colocando um abaixo do outro para melhor compreensão.
**Exemplo:**
``` Kotlin
class Person(val name: String) {}

class PersonMoreDetails(
    val id: Int,
    val namePerson: String,
    val agePerson: Int
){}
```
Na classe podemos ordenar o conteúdo delas na seguinte ordem:
- Variáveis de escopo e inicializações;
- Construtores secundários;
- Objects e companion objects;
- Override;
- Métodos com sobrecarga;
- Funções.
