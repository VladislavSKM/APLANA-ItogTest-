Scenario: Авторизация на Mail.ru , изменение в личных настройках имени и фамилии пользователя.
          Проверка введеных пользователем данных.

Given пользователь открывает главную станицу mail.ru

When вводим логин: 'vladnaldin'
When вводим пароль: 'crimetime111'
When выполняем вход в аккаунт
When выбираем виджет настроек
When переходим в настройку личных даных
When вводим имя пользователя:'Vlad'
When вводим  фамилию пользователя:'Naldin'
When сохраняем изменения

Then снова открываем виджет настроек и сверяем введенные данные 'Vlad Naldin'



