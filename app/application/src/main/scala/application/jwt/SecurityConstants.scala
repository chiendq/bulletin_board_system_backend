package application.jwt

object SecurityConstants {
  val HEADER_TOKEN_REGEX = """Bearer (.+?)""".r
  val SECRET = "SecretToSignJWT"
  val EXPIRATION_TIME = 1800000 // 30 minutes
  val TOKEN_PREFIX = "Bearer "
  val HEADER_STRING = "Authorization"
}
