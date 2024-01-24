# **Organizações no Android Studio**
Aqui são algumas boas práticas para se usar na IDE Android Studio:

## - Activities e Layouts
| Componente | Classe | Nome do Layout |
| :--------: | :----: | :------------: |
| Activity   | UserProfileActivity | activity_user_profile |
| Fragment   | SignUpFragment | fragment_sign_up |
| Dialog     | ChangePasswordDialog | dialog_change_password |

## - Indicadores dos elementos
| Elemento   | Prefixo   |
| :--------: | :-------: |
| TextView   | text_name |
| EditText   | edit_name |
| Button     | button_name |
| ImageView  | image_name |
| Menu       | menu_name |

## - Arquivos em XML
Usamos o Self Closing, que é o como fechamos a tag de um elemento.
Exemplo:
``` xml
<TextView android:textSize="32sp" />
```

