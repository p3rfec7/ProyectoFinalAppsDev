package com.curso.android.app.practica.proyectofinalmigueltrujillo

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class MainUnitTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun whenTextsAreEqual_resultIsIguales() {
        composeTestRule.setContent {
            MainActivity()
        }

        composeTestRule.onNodeWithText("Texto 1").performTextInput("hola")
        composeTestRule.onNodeWithText("Texto 2").performTextInput("hola")
        composeTestRule.onNodeWithText("Comparar").performClick()
        composeTestRule.onNodeWithText("Iguales").assertExists()
    }

    @Test
    fun whenTextsAreDifferent_resultIsDiferentes() {
        composeTestRule.setContent {
            MainActivity()
        }

        composeTestRule.onNodeWithText("Texto 1").performTextInput("hola")
        composeTestRule.onNodeWithText("Texto 2").performTextInput("adios")
        composeTestRule.onNodeWithText("Comparar").performClick()
        composeTestRule.onNodeWithText("Diferentes").assertExists()
    }
}