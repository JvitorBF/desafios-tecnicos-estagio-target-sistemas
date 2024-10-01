dados = {
    "SP": 67836.43,
    "RJ": 36678.66,
    "MG": 29229.88,
    "ES": 27165.48,
    "Outros": 19849.53
}

# Soma os faturamentos mensais
valor_total_mensal = sum(dados.values())

# Copia o dados para que não modifique o input original
dados_percentual = dados.copy()

# Laço para calcular o percentual de representação
for cidade, val in dados.items():
    percentual_representacao = f"{(val * 100) / valor_total_mensal:,.2f}%"
    dados_percentual[cidade] = percentual_representacao

# Exibe os percentuais de cada estado
for cidade, percentual in dados_percentual.items():
    print(f"{cidade}: {percentual}")
