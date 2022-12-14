package domain.auth

import domain.account.valueObjects.{HashedPassword, RawPassword}

trait PasswordHash {
  def make(password: String): String

  def verify(password: RawPassword, hashed: HashedPassword): Boolean
}
