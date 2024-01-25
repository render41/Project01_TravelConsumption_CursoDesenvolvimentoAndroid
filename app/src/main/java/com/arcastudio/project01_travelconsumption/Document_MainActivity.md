# **Compreensões nos Códigos**

- view: Elemento do aplicativo.
- Binding: Ligação com as ações via código.

## Explicação dos Códigos
```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
```
- setContentView: Ele mostra o layout da activity atual.
- R: acessa a pasta "resources"
- layout: acesso da pasta "layout"
- activity_main: layout acessado.