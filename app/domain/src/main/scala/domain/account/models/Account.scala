package domain.account.models

import domain.common.valueObjects.{Email, Password, RawPassword, Username}

case class Account(id: AccountId, username: Username, email: Email, password: Password) {

}